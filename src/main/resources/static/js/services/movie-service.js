/**
 * Created by Alex on 10.01.2016.
 */

angular.module('movieDB.movie-service',[])
    .factory('movieAPIservice',['$http', function($http){
        var movieAPI = {};
        movieAPI.getMovies = function(){
            return $http.get('json/movies.json');
        }
        movieAPI.getGenres = function(){
            return $http.get('json/genras.json');
        }
        return movieAPI;
    }])