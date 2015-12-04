/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('EcommerceAppController', function($rootScope, $scope, $location, $http) {

        $scope.makeCORSrequest = function(){
            $http.get('http://localhost:8011/addResourceToTask/1/1').then(
                // OnSuccess function
                function(answer) {
                    alert('TEST Success');
                },
                // OnFailure function
                function(reason) {
                    alert('FAIL', reason);
                }
            )
        }

});