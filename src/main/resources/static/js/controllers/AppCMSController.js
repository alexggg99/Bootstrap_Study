/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('AppCMSController', function($rootScope, $scope, $location, $http) {

    //$http.get('cms_app/resource/').success(function(data) {
    //    $scope.greeting = data;
    //})

    $scope.login = function(){
        var username = $scope.username;
        var password = $scope.password;
        $location.path('/cms_app/index');
    }


    var authenticate = function(credentials, callback) {
        console.log(credentials);
        var headers = credentials ? {authorization : "Basic "
        + btoa(credentials.username + ":" + credentials.password)
        } : {};
        console.log(headers);
        $http.get('cms_app/user', {headers : headers}).success(function(data) {
            if (data.name) {
                $rootScope.authenticated = true;
            } else {
                $rootScope.authenticated = false;
            }
            callback && callback();
        }).error(function() {
            $rootScope.authenticated = false;
            callback && callback();
        });

    }

    //authenticate();
    $scope.credentials = {};
    $scope.login = function() {
        authenticate($scope.credentials, function() {
            if ($rootScope.authenticated) {
                $location.path("/cms_app");
                $scope.error = false;
            } else {
                $location.path("/cms_app/login");
                $scope.error = true;
            }
        });
    };


});