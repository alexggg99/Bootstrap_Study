/**
 * Created by Alex on 27.11.2015.
 */

app.service('productsService', function($http, $q) {

    var deferObject,
    myMethods = {
        buyProduct: function(product){
            var promise = $http.post('product/buy', product),
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
        },
        getNumber: function(productId){
            var promise = $http.get("product/getNumber"),
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
        getProductsByPageNumber: function(pageNumber, numPerPage, categoryId){
            var promise = $http.get("product/getAll/" + pageNumber + "/" + numPerPage+ "/" + categoryId),
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

});