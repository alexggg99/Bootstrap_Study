///**
// * Created by alexggg99 on 03.07.15.
// */

var app = angular.module('myApp', ['ngRoute']);

//Define Routing for app
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'index',
                controller: 'IndexController'
            }).
            when('/product/:productId', {
                templateUrl: 'product',
                controller: 'productController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

