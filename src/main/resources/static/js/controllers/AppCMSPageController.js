/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('AppCMSPageController', function($rootScope, $scope, $location, $http, $routeParams, pageService, $location) {

    $scope.page = {};
    $scope.pageId = $routeParams.pageId;
    $scope.success   = false;
    $scope.error       = false;

    function loadRemoteData() {
        if($scope.pageId != null){
            pageService.getPageById($scope.pageId).then(
                // OnSuccess function
                function(answer) {
                    $scope.page = answer;
                    $scope.success = true;
                },
                // OnFailure function
                function(reason) {
                    $scope.somethingWrong = reason;
                    $scope.error = true;
                }
            )
        }
    };

    loadRemoteData();

    $scope.categories;
    $scope.category = {};

    $http.get("/cms_app/getCategories").then(function (response) {
        $scope.categories = response.data;
    });

    $scope.savePage = function(){
        if($scope.page){
            pageService.savePage($scope.page).then(
                // OnSuccess function
                function(answer) {
                    $scope.page = answer;
                    $scope.success = true;
                    $location.path("/cms_app/pages")
                },
                // OnFailure function
                function(reason) {
                    $scope.somethingWrong = reason;
                    $scope.error = true;
                }
            )
        }
    }

});