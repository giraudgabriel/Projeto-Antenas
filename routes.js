app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
      templateUrl : "./home/home.html"
    })
    .when("/admin", {
      templateUrl : "./admin/admin.html"
    })
    .when("/escola", {
      templateUrl : "./escola/escola.html"
    })
    .when("/login", {
      templateUrl : "./login/login.html"
    })
    .otherwise({redirectTo:'/'})
})