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
            when('/social_net_app/members', {
                templateUrl: 'social_net_app/members',
                controller: 'AppSocialNetController'
            }).
            when('/social_net_app/profile', {
                templateUrl: 'social_net_app/profile',
                controller: 'AppSocialNetController'
            }).
            when('/social_net_app/photos', {
                templateUrl: 'social_net_app/photos',
                controller: 'AppSocialNetController'
            }).
            when('/agency_app', {
                templateUrl: 'agency_app/index',
                controller: 'AppAgencyController'
            }).
            when('/photo_gallery_app', {
                templateUrl: 'photo_gallery_app/index',
                controller: 'AppPhotoGalleryController'
            }).
            when('/cms_app', {
                templateUrl: 'cms_app/main',
                controller: 'AppCMSController'
            }).
            when('/cms_app/login', {
                templateUrl: 'cms_app/login',
                controller: 'AppCMSController'
            }).
            when('/cms_app/pages', {
                templateUrl: 'cms_app/pages',
                controller: 'AppCMSController'
            }).
            when('/cms_app/page/:pageId', {
                templateUrl: 'cms_app/page',
                controller: 'AppCMSPageController'
            }).
            when('/web_hosting_app', {
                templateUrl: 'web_hosting_app/index',
                controller: 'WebHostingAppController'
            }).
            when('/web_hosting_app/domain', {
                templateUrl: 'web_hosting_app/domain',
                controller: 'WebHostingAppController'
            }).
            when('/web_hosting_app/contact', {
                templateUrl: 'web_hosting_app/contact',
                controller: 'WebHostingAppController'
            }).
            when('/ecommerce_app', {
                templateUrl: 'ecommerce_app/index',
                controller: 'EcommerceAppController'
            }).
            when('/ecommerce_app/product/:productId', {
                templateUrl: 'ecommerce_app/product',
                controller: 'EcommerceAppProductController'
            }).
            when('/business_app', {
                templateUrl: 'bussines_app/index',
                controller: 'BusinessAppController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

