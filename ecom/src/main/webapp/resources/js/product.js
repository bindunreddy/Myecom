/**
 * 
 */
var app=angular.module('bnrApp',[]);
app.controller('bnrctrl',function($scope,$http){
	$http.get('/ecom/product/all').then(function(response) {
		
		$scope.mydata=response.data;

});
});