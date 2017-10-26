angular.module('app.services', []).factory('Payment', function($resource) {
  return $resource('/api/v1/payments/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
