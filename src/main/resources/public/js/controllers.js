angular.module('app.controllers', [])
/* -- PROYECTO -- */
.controller('ProyectoListController', function($scope, $state, popupService, $window, Proyecto) {
  $scope.proyectos = Proyecto.query(); //Trae todos los proyectos. Issues a GET to /api/vi/proyectos

  $scope.deleteProyecto = function(proyecto) { // Borra un proyecto. Issues a DELETE to /api/v1/proyectos/:id
    if (popupService.showPopup('Está seguro de eliminar este proyecto?')) {
    	proyecto.$delete(function() {
        $scope.proyectos = Proyecto.query(); 
        $state.go('proyectos');
      });
    }
  };
}).controller('ProyectoViewController', function($scope, $state, $stateParams, Proyecto) {
  $scope.proyecto = Proyecto.get({ id: $stateParams.id }); //Obtiene un unico proyecto.Issues a GET to /api/v1/proyectos/:id
  
  $scope.back = function() { //Vuelve al listado
	  $state.go('proyectos'); 
  };
  
}).controller('ProyectoCreateController', function($scope, $state, $stateParams, Proyecto) {
  $scope.proyecto = new Proyecto();  //Crea una nueva instancia de Proyecto. Properties will be set via ng-model on UI

  $scope.addProyecto = function() { //Crea un nuevo proyecto. Issues a POST to /api/v1/proyectos
    $scope.proyecto.$save(function() {
      $state.go('proyectos'); // Si sale todo bien vuelve a la lista.
    });
  };
  
  $scope.back = function() { //Vuelve al listado
	  $state.go('proyectos'); 
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
  
  $scope.back = function() { //Vuelve al listado
	  $state.go('proyectos'); 
  };
})
/* -- SUBSIDIO -- */
.controller('SubsidioListController', function($scope, $state, popupService, $window, Subsidio) {
	  $scope.subsidios = Subsidio.query(); //Trae todos los subsidios. Issues a GET to /api/vi/subsidios
	  
	  $scope.deleteSubsidio = function(subsidio) { // Borra un subsidio. Issues a DELETE to /api/v1/subsidios/:id
	    if (popupService.showPopup('Está seguro de eliminar este subsidio?')) {
	    	subsidio.$delete(function() {
	    		$scope.subsidios = Subsidio.query(); 
	    		$state.go('subsidios');
	    	});
	    }
	};
}).controller('SubsidioViewController', function($scope, $state, $stateParams, Subsidio) {
	  $scope.entity = Subsidio.get({ id: $stateParams.id }); //Obtiene un unico subsidio. Issues a GET to /api/v1/subsidios/:id
	  
	  $scope.back = function() { //Vuelve al listado
		  $state.go('subsidios'); 
	  };
	  
}).controller('SubsidioCreateController', function($scope, $state, $stateParams, Subsidio) {
	  $scope.entity = new Subsidio();  //Crea una nueva instancia de Subsidio. Properties will be set via ng-model on UI
	
	  $scope.addSubsidio = function() { //Crea un nuevo subsidio. Issues a POST to /api/v1/subsidios
	    $scope.entity.$save(function() {
	      $state.go('subsidios'); // Si sale todo bien vuelve a la lista.
	    });
	  };
	  
	  $scope.back = function() { //Vuelve al listado
		  $state.go('subsidios'); 
	  };
}).controller('SubsidioEditController', function($scope, $state, $stateParams, Subsidio) {
  $scope.updateSubsidio = function() { //Actualiza el subsidio editado. Issues a PUT to /api/v1/subsidios/:id
    $scope.entity.$update(function() {
      $state.go('subsidios'); // Si sale todo bien vuelve a la lista
    });
  };

  $scope.loadSubsidio = function() { //Issues a GET request to /api/v1/subsidios/:id to get a subsidio to update
    $scope.entity = Subsidio.get({ id: $stateParams.id });
  };

  $scope.loadSubsidio(); // Carga un subsidio que puede ser editado en UI
  
  $scope.back = function() { //Vuelve al listado
	  $state.go('subsidios'); 
  };
})
/* -- IMPUTACION -- */
.controller('ImputacionListController', function($scope, $state, popupService, $window, Imputacion) {
	  $scope.entities = Imputacion.query(); //Trae todas las entities. Issues a GET to /api/vi/entities
	  
	  $scope.deleteImputacion = function(entity) { // Borra una imputacion. Issues a DELETE to /api/v1/entities/:id
	    if (popupService.showPopup('Está seguro de eliminar esta imputación?')) {
	    	entity.$delete(function() {
	    		$scope.entities = Imputacion.query(); 
	    		$state.go('imputaciones');
	    	});
	    }
	};
}).controller('ImputacionViewController', function($scope, $state, $stateParams, Imputacion) {
	  $scope.entity = Imputacion.get({ id: $stateParams.id }); //Obtiene un unico subsidio. Issues a GET to /api/v1/subsidios/:id
	  
	  $scope.back = function() { //Vuelve al listado
		  $state.go('imputaciones'); 
	  };
	  
}).controller('ImputacionCreateController', function($scope, $state, $stateParams, Imputacion) {
	  $scope.entity = new Imputacion();  //Crea una nueva instancia de Imputacion. Properties will be set via ng-model on UI
	
	  $scope.addImputacion = function() { //Crea una nueva imputacion. Issues a POST to /api/v1/imputaciones
	    $scope.entity.$save(function() {
	      $state.go('imputaciones'); // Si sale todo bien vuelve a la lista.
	    });
	  };
	  
	  $scope.back = function() { //Vuelve al listado
		  $state.go('imputaciones'); 
	  };
}).controller('ImputacionEditController', function($scope, $state, $stateParams, Imputacion) {
  $scope.updateImputacion = function() { //Actualiza la imputacion editada. Issues a PUT to /api/v1/imputaciones/:id
    $scope.entity.$update(function() {
      $state.go('imputaciones'); // Si sale todo bien vuelve a la lista
    });
  };

  $scope.loadImputacion = function() { //Issues a GET request to /api/v1/imputaciones/:id to get a imputacion to update
    $scope.entity = Imputacion.get({ id: $stateParams.id });
  };

  $scope.loadImputacion(); // Carga una imputacion que puede ser editada en UI
  
  $scope.back = function() { //Vuelve al listado
	  $state.go('imputaciones'); 
  };
});
