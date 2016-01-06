/**
 * Created by Alex on 27.11.2015.
 */

app.service('contactService', function($http) {

    var self = this;

    self.postForm = function(data,callback){
        $http.post('/contact', data).then(function(res){
            callback(res);
        },function(res) {
            // Handle error
            callback(res);
        })
    }

});