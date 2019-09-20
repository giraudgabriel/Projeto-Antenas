app.controller("projetoCtrl", function ($scope, $rootScope) {
    $scope.model = {
        titulo: null,
        descricao: null,
        status: 1,
        url: null,
        feedback: null
    }
    $rootScope.status = {
        Rejeitado: -1,
        EmAnalise: 1,
        AguardandoInfo: 2,
        EsperaReuniao: 3,
        EmDesenvolvimento: 4,
        Finalizado: 0
    }
    if ($scope.as != null)
        $scope.model = $scope.as

    $scope.DefinirClasseProjeto = (projeto) => {
        switch (projeto.status) {
            case $rootScope.status.Rejeitado:
                return 'bg-danger'
            case $rootScope.status.EmAnalise:
            case $rootScope.status.AguardandoInfo:
            case $rootScope.status.EsperaReuniao:
                return 'bg-warning'
            case $rootScope.status.EmDesenvolvimento:
                return 'bg-primary'
            case $rootScope.status.Finalizado:
                return 'bg-success'
            default:
                break;
        }
    }

    $scope.DefinirStatusProjeto = (projeto) => {
        switch (projeto.status) {
            case $rootScope.status.Rejeitado:
                return 'Rejeitado'
            case $rootScope.status.EmAnalise:
            case $rootScope.status.AguardandoInfo:
            case $rootScope.status.EsperaReuniao:
                return `Em análise parte:${projeto.status}`
            case $rootScope.status.EmDesenvolvimento:
                return 'Em desenvolvimento'
            case $rootScope.status.Finalizado:
                return 'Finalizado'
            default:
                break;
        }
    }

    $scope.DefinirBotaoProjeto = (projeto) => {
        switch (projeto.status) {
            case $rootScope.status.Rejeitado:
                return 'btn-outline-danger'
            case $rootScope.status.EmAnalise:
            case $rootScope.status.AguardandoInfo:
            case $rootScope.status.EsperaReuniao:
                return 'bg-outline-warning'
            case $rootScope.status.EmDesenvolvimento:
                return 'bg-outline-primary'
            case $rootScope.status.Finalizado:
                return 'btn-outline-success'
            default:
                break;
        }
    }

    $scope.AdicionarGit = (projeto) => {
        $rootScope.projetoSelecionado = projeto;
    }
    $scope.AlterarStatus = (projeto) => {
        if (projeto.status < 4)
            projeto.status += 1
        else
            projeto.status = -1
    }
})