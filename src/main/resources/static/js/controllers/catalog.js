/**
 * Created by Alex on 08.01.2016.
 */


angular.module("movieDB.controllers",['ui.bootstrap'])
    .controller('catalogCtrl',[
        '$scope', '$http', function($scope, $http){
        $scope.currentPage = 1;
        $scope.pageSize = 24;

        $http.get('json/movies.json').success(function(data){
            $scope.movieList = data;
        })
    }])