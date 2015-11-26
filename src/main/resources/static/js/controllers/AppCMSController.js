/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('AppCMSController', function($rootScope, $scope, $location, $http) {

    $scope.json =
        [{"id":1, "title":"Page One", "Category":"Category One", "Author":"Author One"},
            {"id":2, "title":"Page Two", "Category":"Category Two", "Author":"Author Two"},
            {"id":3, "title":"Page Three", "Category":"Category Three", "Author":"Author Three"},
            {"id":4, "title":"Page Four", "Category":"Category Four", "Author":"Author Four"}]

    //$http.get('cms_app/resource/').success(function(data) {
    //    $scope.greeting = data;
    //})

    //$scope.login = function(){
    //    var username = $scope.username;
    //    var password = $scope.password;
    //    $location.path('/cms_app/index');
    //}


    var authenticate = function(credentials, callback) {
        console.log(credentials);
        var headers = credentials ? {authorization : "Basic "
        + btoa(credentials.username + ":" + credentials.password)
        } : {};
        console.log(headers);
        $http.get('cms_app/user', {headers : headers}).success(function(data) {
            if (data.name) {
                $rootScope.authenticated = true;
            } else {
                $rootScope.authenticated = false;
            }
            callback && callback();
        }).error(function() {
            $rootScope.authenticated = false;
            callback && callback();
        });

    }

    //authenticate();
    $scope.credentials = {};
    $scope.login = function() {

        authenticate($scope.credentials, function() {
            if ($rootScope.authenticated) {
                $location.path("/cms_app");
                $scope.error = false;
            } else {
                $location.path("/cms_app/login");
                $scope.error = true;
            }
        });
    };

    $scope.logout = function() {
        $http.post('logout', {}).success(function () {
            $rootScope.authenticated = false;
            $location.path("/cms_app");
        }).error(function (data) {
            $rootScope.authenticated = false;
        });
    };

    $scope.checkSession = function(){
        $http.post('cms_app/checkSession').success(function(){
            $rootScope.authenticated = true;
            console.log($rootScope.authenticated);
        })
    };

    $scope.searchbox = "";

    $scope.filter = function(){href="#/cms_app/page"
        console.log($scope.json);
        //var rows = $('.tablesorter tr');
        //$('#searchbox').keyup(function(){
        //    var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase();
        //    rows.show().filter(function(){
        //        var text = $(this).text().replace(/ \s+/g, ' ').toLowerCase();
        //        return !~text.indexOf(val);
        //    }).hide();
        //})
    };

    $scope.page = {};
    $scope.pageId = 1;

    $scope.getPage = function (page) {
        $scope.create = false;
        $scope.page = page;
        $location.path('/cms_app/page');
    };


    $scope.click123 = function () {
        console.log($scope.page)
    };

});