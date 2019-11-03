app.controller("loginCtrl", function ($scope) {
    $scope.login = $scope.cadastrar == null || $scope.cadastrar == false ? true : false;

    switch ($scope.tipo) {
        case 'escola':
            $scope.form = {
                email: {
                    placeholder: 'E-mail Institucional',
                }
            }
            break
        default:
            $scope.form = {
                email: {
                    placeholder: 'E-mail'
                }
            }
    }
})