/**
 * Created by Alex on 27.11.2015.
 */

app.service('productsService', ['$http', '$q', function($http, $q) {

    var deferObject,
    myMethods = {
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
        getAllProducts: function(){
            var promise = $http.get('product/getAll'),
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
        },
        getProduct: function(productId){
            var promise = $http.get("product/"+productId),
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