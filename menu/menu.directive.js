app.directive('menu', function () {
    return {
        templateUrl: './menu/menu.html',
        controller: 'menuCtrl',
        scope: {
            tipo: "="
        }
    };
});
app.controller("menuCtrl", function ($scope) {
    DefinirTitulo($scope.tipo)

    function DefinirTitulo(tipo) {
        switch (tipo) {
            case 'e':
                $scope.user = "Empresário"
                break

            case 'c':
                $scope.user = "Cadi"
                break

            case 'a':
                $scope.user = "Aluno"
                break

            case 'p':
                $scope.user = "Professor"
                break

        }
    }
})