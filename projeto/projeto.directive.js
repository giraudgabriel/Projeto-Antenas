app.directive('projeto', function () {
    return {
        templateUrl: './projeto/projeto.html',
        controller:'projetoCtrl',
        controllerAs:'ctrl',
        scope:{
            as: "=",
            cad:"=",
            aluno:"=",
            professor:"="
        }
    };
});