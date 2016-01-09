/**
 * Created by Alex on 09.01.2016.
 */

angular.module("movieDB.movie",['ui.bootstrap'])
    .controller('movieCtrl',[
        '$scope', '$http', '$filter', '$routeParams', function($scope, $http, $filter, $routeParams){

            $scope.movieId = $routeParams.id;

            $http.get('json/movies.json').success(function(data){
                $scope.movie = $filter('filter')(data, {id: parseInt($scope.movieId)}, true)[0];
            })

        }])