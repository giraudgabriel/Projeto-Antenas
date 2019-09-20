app.controller("empresarioCtrl", function ($rootScope, notify, $rootScope) {

    $rootScope.status = {
        Rejeitado: -1,
        EmAnalise: 1,
        AguardandoInfo: 2,
        EsperaReuniao: 3,
        EmDesenvolvimento: 4,
        Finalizado: 0
    }

    $rootScope.projetos = [{
        titulo: "Projeto",
        descricao: "Descrição",
        status: $rootScope.status.EmDesenvolvimento,
        url: "www.facebook.com",
        feedback: null,
    }]

    $rootScope.novoProjeto = () => {
        $rootScope.projeto = {
            titulo: null,
            descricao: null,
            status: 1,
            url: null,
            feedback: null,
        }
    }

    $rootScope.novoProjeto()

    $rootScope.addProjeto = (projeto) => {
        if (projeto.titulo == null || projeto.descricao == null) {
            notify({
                classes: "alert-warning",
                message: "Preencha os campos obrigatórios!"
            })
            return
        }
        if ($rootScope.projetos.indexOf(projeto) == -1) {
            $rootScope.projetos.push(projeto)
            notify({
                classes: "alert-success",
                message: "Enviado para análise!"
            })
            $('#collapseTwo').collapse("show")
            $('#collapseOne').collapse("hide")
            $rootScope.novoProjeto();

        } else {
            notify({
                classes: "alert-danger",
                message: "Já existe um registro com esses dados!"
            })
            $rootScope.novoProjeto();

        }

    }
})