/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('MenuController', function($scope, $location, categoryService, authService) {

    $scope.categories = [];

    $scope.init = function(){
        categoryService.getAllCategories().then(function(data){
            $scope.categories = data.data;
        })
    }

    $scope.login = function () {
        authService.login($scope.user, function (data) {
            if (!data.error) location.reload();
            else jQuery('#error.modal').modal('show');
        });
    };
    $scope.logout = function () {
        authService.logout(function (data) {
            if (!data.error) location.reload();
            else jQuery('#error.modal').modal('show');
        });
    };

});