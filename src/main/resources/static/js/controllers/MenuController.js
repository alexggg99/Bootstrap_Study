/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('MenuController', function($scope, $location, categoryService) {

    $scope.categories = [];

    $scope.init = function(){
        categoryService.getAllCategories().then(function(data){
            $scope.categories = data.data;
        })
    }

});