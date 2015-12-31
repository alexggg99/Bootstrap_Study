/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('MenuController', function($scope, $location, categoryService, authService, userService) {

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
            if (!data.error) location.reload();
            else jQuery('#error.modal').modal('show');
        });
    };

});