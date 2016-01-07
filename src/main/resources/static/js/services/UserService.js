/**
 * Created by Alex on 27.11.2015.
 */

app.service('userService', function($http, $q) {

    var self = this;

    self.getUser = function(callback){
        //console.log(userId);
        $http.get("/user").then(function(res){
            callback(res.data);
        })
    }

    self.saveUser = function(user, callback){
        $http.post('/user', user).then(function(res){
            callback(res);
        }, function(res){
            callback(res);
        })
    }

    self.check = function(callback){
        $http.get("/auth/check").then(function(res){
            callback(res.data);
        })
    }

});