/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('productController', function($rootScope, $scope, $location, $http, $routeParams, productsService) {

    $scope.productId = $routeParams.productId;
    $scope.product;
    $scope.responseStatus;
    $scope.user_email;

    $scope.init = function(){
        productsService.getProduct($scope.productId).then(function(data){
            $scope.product = data.data;
        })
    }

    $scope.buy = function(){
        productsService.buyProduct($scope.product).then(function(res){
            $scope.responseStatus = 200;
            $scope.user_email = res.email;
        },function(res){
            if(res.status = 403){
                $scope.responseStatus = 403;
            }
        })
    }

});