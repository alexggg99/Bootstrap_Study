/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('IndexController', function($scope, $location, productsService) {

    $scope.products = [];

    $scope.init = function(){
        productsService.getAllProducts().then(function(data){
            $scope.products = data.data;
        });
    };

    $scope.getStars = function(n){
        var i = Math.round(n)
        return new Array(i);
    }

    $scope.silence = function($event){
        $event.stopPropagation();
    }

});