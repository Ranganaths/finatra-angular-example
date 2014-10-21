angular.module('shoppingCart.site').factory("Product", ['$resource', function($resource) {
    return $resource('api/product', null, {
        addToCart: {
            method: 'PUT'
        }
    });
}]);