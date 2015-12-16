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
                controller: 'HomeController'
            }).
            when('/ecommerce_app', {
                templateUrl: 'ecommerce_app/index',
                controller: 'EcommerceAppController'
            }).
            when('/ecommerce_app/product/:productId', {
                templateUrl: 'ecommerce_app/product',
                controller: 'EcommerceAppProductController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

