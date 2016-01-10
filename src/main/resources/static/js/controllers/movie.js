/**
 * Created by Alex on 09.01.2016.
 */

angular.module("movieDB.movie",['ui.bootstrap'])
    .controller('movieCtrl',[
        '$scope', 'movieAPIservice', '$filter', '$routeParams', function($scope, movieAPIservice, $filter, $routeParams){

            $scope.movieId = $routeParams.id;

            movieAPIservice.getMovies().success(function(data){
                $scope.movie = $filter('filter')(data, {id: parseInt($scope.movieId)}, true)[0];
            })

        }])