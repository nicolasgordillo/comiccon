angular.module('app.services', []).factory('Proyecto', function($resource) {
  return $resource('/api/v1/proyectos/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
