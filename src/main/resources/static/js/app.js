///**
// * Created by alexggg99 on 03.07.15.
// */
////(function() {
//    //var app = angular.module('myApp', []);
//    var app=angular.module("myApp",[]);
//
//    app.config(["$routeProvider",function($routeProvider){
//        $routeProvide.when('/', {
//            templateUrl:"home.html",
//            controller:'HomeController'
//        })
//            .otherwise({redirectTo:'/'})
//    }])
////})
//
//function HomeController(){
//
//}
//
//app.controller('HomeController', HomeController);

var app = angular.module('myApp', ['ngRoute']);

//Define Routing for app
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'home',
                controller: 'HomeController'
            }).
            when('/menu', {
                templateUrl: 'menu',
                controller: 'HomeController'
            }).
            when('/typography', {
                templateUrl: 'typography',
                controller: 'HomeController'
            }).
            when('/app_sales', {
                templateUrl: 'app_sales/about',
                controller: 'AppSalesController'
            }).
            when('/app_sales/content', {
                templateUrl: 'app_sales/content',
                controller: 'AppSalesController'
            }).
            when('/app_resume', {
                templateUrl: 'app_resume/home',
                controller: 'AppSalesController'
            }).
            when('/social_net_app', {
                templateUrl: 'social_net_app/index',
                controller: 'AppSocialNetController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

