app.controller("projetoCtrl", function ($scope) {
    $scope.projeto = {
        titulo: null,
        descricao: null,
        status: 1
    }

    $scope.DefinirClasseProjeto = (projeto) => {
        return projeto.status == 1 ? 'bg-primary' : projeto.status == 2 ? 'bg-warning' : projeto.status == 3 ? 'bg-danger' : 'bg-success'
    }

    $scope.DefinirStatusProjeto = (projeto) => {
        return projeto.status == 1 ? 'Em desenvolvimento' : projeto.status == 2 ? 'Em análise' : projeto.status == 3 ? 'Rejeitado' : 'Concluído'
    }

    $scope.DefinirBotaoProjeto = (projeto) => {
        return projeto.status == 1 ? 'btn-outline-primary' : projeto.status == 2 ? 'btn-outline-warning' : projeto.status == 3 ? 'btn-outline-danger' : 'btn-outline-success'
    }

    $scope.AlterarStatus = (projeto) => {
        if (projeto.status < 4)
            projeto.status += 1
        else
            projeto.status = 1
    }
})