/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('AppSalesController', function($scope, $location) {

    $scope.email = [];

    $scope.selectedMail = {};

    $scope.showReplay = false;

    $scope.replay = function(){
        $location.path("/#/replay");
    };

    $scope.silence = function($event){
        $event.stopPropagation();
    }


});