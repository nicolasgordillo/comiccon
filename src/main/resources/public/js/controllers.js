angular.module('app.controllers', []).controller('ProyectoListController', function($scope, $state, popupService, $window, Proyecto) {
  $scope.proyectos = Proyecto.query(); //Trae todos los proyectos. Issues a GET to /api/vi/proyectos

  $scope.deleteProyecto = function(proyecto) { // Borra un proyecto. Issues a DELETE to /api/v1/proyectos/:id
    if (popupService.showPopup('Está seguro de eliminar este proyecto?')) {
    	proyecto.$delete(function() {
        $scope.proyectos = Proyecto.query(); 
        $state.go('proyectos');
      });
    }
  };
}).controller('ProyectoViewController', function($scope, $stateParams, Proyecto) {
  $scope.proyecto = Proyecto.get({ id: $stateParams.id }); //Obtiene un unico proyecto.Issues a GET to /api/v1/proyectos/:id
}).controller('ProyectoCreateController', function($scope, $state, $stateParams, Proyecto) {
  $scope.proyecto = new Proyecto();  //Crea una nueva instancia de Proyecto. Properties will be set via ng-model on UI

  $scope.addProyecto = function() { //Crea un nuevo proyecto. Issues a POST to /api/v1/proyectos
    $scope.proyecto.$save(function() {
      $state.go('proyectos'); // Si sale todo bien vuelve a la lista.
    });
  };
}).controller('ProyectoEditController', function($scope, $state, $stateParams, Proyecto) {
  $scope.updateProyecto = function() { //Actualiza el proyecto editado. Issues a PUT to /api/v1/proyectos/:id
    $scope.proyecto.$update(function() {
      $state.go('proyectos'); // Si sale todo bien vuelve a la lista
    });
  };

  $scope.loadProyecto = function() { //Issues a GET request to /api/v1/proyectos/:id to get a proyecto to update
    $scope.proyecto = Proyecto.get({ id: $stateParams.id });
  };

  $scope.loadProyecto(); // Carga un proyecto que puede ser editado en UI
});
