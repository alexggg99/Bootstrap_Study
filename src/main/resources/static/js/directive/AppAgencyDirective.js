/**
 * Created by alexggg99 on 19.07.15.
 */


app.directive('scroll', function($window){
    return function(scope, element, attrs){
        angular.element($window).bind('scroll', function(){
            if (this.pageYOffset >= 246) {
                $('.navbar-fixed-top').removeAttr('background-color');
                $('.navbar-fixed-top').attr('background-color', '#333333');

            } else {
                $('.navbar-fixed-top').attr('background-color', 'transparent;');
            }
            scope.$apply();
        })
    }
})