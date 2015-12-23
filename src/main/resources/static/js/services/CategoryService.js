/**
 * Created by Alex on 27.11.2015.
 */

app.service('categoryService', ['$http', '$q', function($http, $q) {

    var deferObject,
    myMethods = {
        getAllCategories: function(){
            var promise = $http.get('category/'),
                deferObject  =  deferObject || $q.defer();

            promise.then(
                // OnSuccess function
                function(answer){
                    deferObject.resolve(answer);
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