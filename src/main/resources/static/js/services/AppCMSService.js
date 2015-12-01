/**
 * Created by Alex on 27.11.2015.
 */

app.service('pageService', ['$http', '$q', function($http, $q) {

    var deferObject,
    myMethods = {
        getPageById: function (pageId) {
            var promise = $http.get('cms_app/resource/' + pageId),
                deferObject  =  deferObject || $q.defer();

            promise.then(
                // OnSuccess function
                function(answer){
                    deferObject.resolve(answer.data);
                },
                // OnFailure function
                function(reason){
                    deferObject.reject(reason);
                });
            return deferObject.promise;
        },
        savePage: function(page){
            var promise = $http.post('cms_app/savePage/', page),
                deferObject  =  deferObject || $q.defer();

            promise.then(
                // OnSuccess function
                function(answer){
                    deferObject.resolve(answer.data);
                },
                // OnFailure function
                function(reason){
                    deferObject.reject(reason);
                });
            return deferObject.promise;
        },
        getAllPages: function(){
            var promise = $http.get('cms_app/resource/'),
                deferObject  =  deferObject || $q.defer();

            promise.then(
                // OnSuccess function
                function(answer){
                    deferObject.resolve(answer.data);
                },
                // OnFailure function
                function(reason){
                    deferObject.reject(reason);
                });
            return deferObject.promise;
    }
    }

    return myMethods;

}]);