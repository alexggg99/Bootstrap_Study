/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('profileController', function($scope, userService, $location) {

    $scope.user = {
    };
    var originalUser = {};
    $scope.responseStatus;

    $scope.init = function(){
        userService.getUser(function(data){
            $scope.user = data;
            originalUser = angular.copy($scope.user);
        });
    }

    $scope.saveUser = function(){
        userService.saveUser($scope.user, function(res){
            if(res.status == 200){
                $scope.responseStatus = 200;
                originalUser = angular.copy($scope.user);
            }else{
                $scope.responseStatus = 500;
            }
        })
    }

    $scope.canSave = function(){
        return !angular.equals($scope.user, originalUser);
    }

    $scope.revert = function(){
        $scope.user = angular.copy(originalUser);
    }

    $scope.canRevert = function() {
        return !angular.equals($scope.user, originalUser);
    };

});