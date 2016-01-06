/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('MenuController', function($scope, categoryService, authService, userService, $route, $routeParams, $location) {

    $scope.$route = $route;
    $scope.$location = $location;
    $scope.$routeParams = $routeParams;

    $scope.categories = [];

    $scope.user = {
        error : true
    };

    $scope.init = function(){
        categoryService.getAllCategories().then(function(data){
            $scope.categories = data.data;
        })
        userService.check(function(data){
            $scope.user = data;
        });
    }

    $scope.login = function () {
        authService.login($scope.user, function (data) {
            if (!data.error){
                $scope.user = data;
                console.log($scope.user);
            }
            else $scope.user.error = true;
        });

    };
    $scope.logout = function () {
        authService.logout(function (data) {
            if (!data.error){
                $scope.user.error = true;
                $location.path($location.path());
            }
        });
    };

});