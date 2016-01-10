/**
 * Created by Alex on 08.01.2016.
 */


angular.module("movieDB.controllers",['ui.bootstrap'])
    .controller('catalogCtrl',['$scope', 'movieAPIservice', function($scope, movieAPIservice){
        $scope.currentPage = 1;
        $scope.pageSize = 24;

        movieAPIservice.getMovies().success(function(data){
            $scope.movieList = data;
        })

        movieAPIservice.getGenres().success(function(data){
            $scope.genreList = data;
        })

    }])

    .controller('gendeCtrl',['$scope', 'movieAPIservice', '$routeParams', '$filter', function($scope, movieAPIservice, $routeParams, $filter){
        $scope.currentPage = 1;
        $scope.pageSize = 24;
        $scope.genreName = $routeParams.genreName;
        $scope.pageTitle = $scope.genreName;

        movieAPIservice.getMovies().success(function(data){
            $scope.movieList = $filter('filter')(data, function(movie){
                return $filter('filter')(movie.genres,{name:$scope.genreName}).length;
            });
        });

        movieAPIservice.getGenres().success(function(data){
            $scope.genreList = data;
        })

    }])