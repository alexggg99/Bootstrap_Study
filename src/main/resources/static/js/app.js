///**
// * Created by alexggg99 on 03.07.15.
// */

var app = angular.module('movieDB',
    ['ngRoute', 'movieDB.controllers', 'movieDB.paginate-filter', 'movieDB.movie']);

//Define Routing for app
app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when("/",
        {
            templateUrl: "/views/catalog.html",
            controller: "catalogCtrl"
        })
        .when("/movie/:id",
        {
            templateUrl:"/views/movie.html",
            controller: "movieCtrl"
        })
        .otherwise({redirectTo: "/"})
}]);
