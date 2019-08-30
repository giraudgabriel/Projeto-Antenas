var app = angular.module("fatecApp", []); 
  $(function () {
  $('[data-toggle="popover"]').popover()
  $('[data-toggle="tooltip"]').tooltip()})
app.controller("loginCtrl", function($scope) {

	$scope.definirCorBotao = (user) => definirCorBotao(user);

	function definirCorBotao (user) {
		return user.usuario !=null && user.senha.length >=6 ? 'btn-success' : 'btn-danger';
	};
});