angular.module('app.controllers', []).controller('PaymentListController', function($scope, $state, popupService, $window, Payment) {
  $scope.payments = Payment.query(); //fetch all payments. Issues a GET to /api/vi/payments

  $scope.deletePayment = function(payment) { // Delete a Payment. Issues a DELETE to /api/v1/payments/:id
    if (popupService.showPopup('Está seguro de eliminar este pago?')) {
      payment.$delete(function() {
        $scope.payments = Payment.query(); 
        $state.go('payments');
      });
    }
  };
}).controller('PaymentViewController', function($scope, $stateParams, Payment) {
  $scope.payment = Payment.get({ id: $stateParams.id }); //Get a single payment.Issues a GET to /api/v1/payments/:id
}).controller('PaymentCreateController', function($scope, $state, $stateParams, Payment) {
  $scope.payment = new Payment();  //create new payment instance. Properties will be set via ng-model on UI

  $scope.addPayment = function() { //create a new payment. Issues a POST to /api/v1/payments
    $scope.payment.$save(function() {
      $state.go('payments'); // on success go back to the list i.e. payments state.
    });
  };
}).controller('PaymentEditController', function($scope, $state, $stateParams, Payment) {
  $scope.updatePayment = function() { //Update the edited payment. Issues a PUT to /api/v1/payments/:id
    $scope.payment.$update(function() {
      $state.go('payments'); // on success go back to the list i.e. payments state.
    });
  };

  $scope.loadPayment = function() { //Issues a GET request to /api/v1/payments/:id to get a payment to update
    $scope.payment = Payment.get({ id: $stateParams.id });
  };

  $scope.loadPayment(); // Load a payment which can be edited on UI
});
