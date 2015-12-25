///**
// * Created by alexggg99 on 03.07.15.
// */

var app = angular.module('myApp', ['ngResource', 'ngRoute']);

//Define Routing for app
app.config(function($httpProvider, $routeProvider, $locationProvider) {
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

        $httpProvider.defaults.withCredentials = true;
        $locationProvider.html5Mode(true).hashPrefix('!');

    });

