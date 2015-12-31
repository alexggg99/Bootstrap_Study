/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('profileController', function($scope, userService) {

    $scope.user = {
    };

    $scope.init = function(){
        userService.getUser(function(data){
            $scope.user = data;
        });
    }

});