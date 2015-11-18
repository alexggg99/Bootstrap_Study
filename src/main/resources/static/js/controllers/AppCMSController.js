/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('AppCMSController', function($scope, $location) {



    $scope.login = function(){
        var username = $scope.username;
        var password = $scope.password;
        $location.path('/cms_app/index');
    }



});