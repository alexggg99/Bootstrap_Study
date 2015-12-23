/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('productController', function($rootScope, $scope, $location, $http, $routeParams, productsService) {

    $scope.productId = $routeParams.productId;
    $scope.product;

    $scope.init = function(){
        productsService.getProduct($scope.productId).then(function(data){
            $scope.product = data.data;
        })
    }

});