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
}).factory('Subsidio', function($resource) {
  return $resource('/api/v1/subsidios/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).factory('Imputacion', function($resource) {
  return $resource('/api/v1/imputaciones/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).factory('IncisoProyecto', function($resource) {
  return $resource('/api/v1/incisosProyecto/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
});
