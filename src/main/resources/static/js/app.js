///**
// * Created by alexggg99 on 03.07.15.
// */

var app = angular.module('myApp', ['ngResource', 'ngRoute']);

//Define Routing for app
app.config(function($httpProvider, $routeProvider, $locationProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'view',
                controller: 'IndexController'
            }).
            when('/product/:productId', {
                templateUrl: 'profile/view',
                controller: 'productController'
            }).
            when('/profile', {
                templateUrl: 'profile/view',
                controller: 'profileController'
            }).
            otherwise({
                redirectTo: '/'
            });

        $httpProvider.defaults.withCredentials = true;
        $locationProvider.html5Mode(true).hashPrefix('!');

    });

