/**
 * Created by Alex on 27.11.2015.
 */

app.service('authService', ['$http', function($http) {

    var self = this;
    var auth_server_url = 'http://localhost:8070';

    self.login = function (data, callback) {
        console.log(data);
        //callback({error: false});
        $http.post(auth_server_url + '/auth/login.json', data).then(function (res) {
            callback(res.data);
        });
    };

    self.logout = function (callback) {
        //callback({error: true});
        $http.get(auth_server_url + '/auth/logout.json').then(function (res) {
            callback(res.data);
        });
    };

}]);