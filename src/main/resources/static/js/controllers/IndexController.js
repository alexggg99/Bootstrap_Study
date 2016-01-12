/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('IndexController', function($scope, $rootScope, $location, productsService) {

    $scope.products = [];

    $rootScope.$watch('category', function (category) {
        $scope.category = category;
    });

    $scope.init = function(){
        productsService.getAllProducts().then(function(data){
            $scope.products = data.data;
        });
    };

    $scope.getStars = function(n){
        var i = Math.round(n);
        return new Array(i);
    };

    $scope.silence = function($event){
        $event.stopPropagation();
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