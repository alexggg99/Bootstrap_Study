/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('IndexController', function($scope, $rootScope, $location, productsService) {

    $scope.products = [];

    $scope.currentPage = 1
        ,$scope.numPerPage = 3
        ,$scope.maxSize = 2;


    $rootScope.$watch('category', function (category) {
        $scope.category = category;
        $scope.getElements(1);
        var category = angular.isUndefined($scope.category) || $scope.category == null ? -1 : $scope.category.id;
        productsService.getNumberByCategory(category).then(function(number){
            var pages = number.data/$scope.numPerPage;
            $scope.pagination = $scope.getPagination(Math.ceil(pages));
        });
    });

    $scope.init = function(){
        var category = angular.isUndefined($scope.category) ? -1 : $scope.category.id;
        productsService.getNumber().then(function(number){
            var pages = number.data/$scope.numPerPage
            $scope.pagination = $scope.getPagination(Math.ceil(pages));
        });
        productsService.getProductsByPageNumber($scope.currentPage - 1, $scope.numPerPage, category).then(function(data){
            $scope.products = data.data.content;
        });
    };

    $scope.getPagination = function(length) {
        return new Array(length);
    }

    $scope.getStars = function(n){
        var i = Math.round(n);
        return new Array(i);
    };

    $scope.silence = function($event){
        $event.stopPropagation();
    }

    $scope.getElements = function(pageNumber){
        var category = angular.isUndefined($scope.category) || $scope.category == null ? -1 : $scope.category.id;
        productsService.getProductsByPageNumber(pageNumber - 1, $scope.numPerPage, category).then(function(data){
            $scope.products = data.data.content;
        });
    }

});

app.filter('filterByCategory', function(){
    return function(items, field){
        var result = {};
        if(angular.isUndefined(field)){
            return items;
        }
        angular.forEach(items, function(value, key){
            var flag = value.category.id == field.id;
            if(flag){
                result[key] = value;
            }
        });
        return result;
    }
});