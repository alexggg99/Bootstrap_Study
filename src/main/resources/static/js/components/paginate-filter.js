/**
 * Created by Alex on 09.01.2016.
 */


angular.module('movieDB.paginate-filter',[])
    .filter('paginate', function(){
        return function(arr, currentPage, pageSize){
            try{
                return arr.slice((currentPage-1)*pageSize,currentPage*pageSize)
            }catch(err){
                return arr;
            }
        }
    });