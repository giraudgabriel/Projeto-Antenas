app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
      templateUrl : "./home/home.html"
    })
    .when("/admin", {
      templateUrl : "./admin/admin.html",
      controller:"empresarioCtrl"
    })
    .when("/escola", {
      templateUrl : "./escola/escola.html"
    })
    .when("/login", {
      templateUrl : "./login/login.html"
    })
    .when("/projeto",{
      templateUrl : "./admin/admin.html"
    })
    .when("/cad",{
      templateUrl: "./cad/cad.html"
    })
    .when("/empresario",{
      templateUrl: "./empresario/empresario.html",
      controller:"empresarioCtrl",
      controllerAs:"ctrl"
    })
    .when("/aluno",{
      templateUrl:"./aluno/aluno.html",
      controller:"empresarioCtrl"
    })
    .when("/professor",{
      templateUrl:"./professor/professor.html",
      controller:"empresarioCtrl"
    })
    .otherwise({redirectTo:'/'});
})