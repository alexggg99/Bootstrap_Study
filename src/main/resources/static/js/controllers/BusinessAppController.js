/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('BusinessAppController', function($scope, $location) {

    $scope.email = [];

    $scope.selectedMail = {};

    $scope.showReplay = false;

    $scope.replay = function(){
        $location.path("/#/replay");
    };

    $scope.silence = function($event){
        $event.stopPropagation();
    }

    $scope.click = function(e){
        e.preventDefault();
        var anchor = $(e.target).attr('href');
        $('html, body').stop().animate({
            scrollTop: $(anchor).offset().top
        }, 1500)
    }



});