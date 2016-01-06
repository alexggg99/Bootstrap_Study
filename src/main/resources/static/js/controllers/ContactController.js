/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('contactController', function($rootScope, $scope, contactService) {

    $scope.form = {};
    $scope.responseStatus;

    $scope.postMessage = function(){
        contactService.postForm($scope.form, function(response){
            if(response.status == 200){
                $scope.responseStatus = 200;
                $scope.form = {};
            }else{
                $scope.responseStatus = 500;
            }
        })
    }

});