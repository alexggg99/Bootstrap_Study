/**
 * Created by Alex on 08.01.2016.
 */


angular.module("movieDB.catalog",[])
    .controller('catalogCtrl',['$scope', '$http', function($scope, $http){
        $http.get('json/movies.json').success(function(data){
            $scope.movieList = data;
        })
    }])