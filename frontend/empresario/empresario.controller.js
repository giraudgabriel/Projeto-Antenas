app.controller("empresarioCtrl", function ($rootScope, notify, $rootScope) {

    $rootScope.status = {
        Rejeitado: -1,
        EmAnalise: 1,
        AguardandoInfo: 2,
        EsperaReuniao: 3,
        EmDesenvolvimento: 4,
        Finalizado: 0
    }
    $rootScope.usuarios = []

    $rootScope.salvarGit = (projeto) => {
        if (projeto.aluno.git && projeto.aluno.obs) {
            let index = $rootScope.projetos.indexOf(p => {
                return p.Titulo == projeto.Titulo
            })
            if (index > -1) {
                projeto.status = $rootScope.status.Finalizado
                $rootScope.projetos[index] = projeto
                notify({
                    classes: 'alert-success',
                    message: 'Salvo com sucesso'
                })
                $rootScope.projetoSelecionado = null
            } else {
                notify({
                    classes: "alert-danger",
                    message: "Projeto não encontrado,favor atualizar a página!"
                })
            }
        }

    }

    $rootScope.marcarReuniao = (projeto) => {
        $rootScope.projetoSelecionado = projeto
        $rootScope.reuniao = true
    }

    $rootScope.projetos = [{
            titulo: "Projeto",
            descricao: "Descrição",
            status: $rootScope.status.EmDesenvolvimento,
            url: "www.facebook.com",
            feedback: null,
        }, {
            titulo: "Projeto 1",
            descricao: "Descrição",
            status: $rootScope.status.EmAnalise,
            url: "www.facebook.com",
            feedback: null,
        },
        {
            titulo: "Projeto2",
            descricao: "Descrição",
            status: $rootScope.status.AguardandoInfo,
            url: "www.facebook.com",
            feedback: null,
        },
        {
            titulo: "Projeto3",
            descricao: "Descrição",
            status: $rootScope.status.EsperaReuniao,
            url: "www.facebook.com",
            feedback: null,
        },
        {
            titulo: "Projeto4",
            descricao: "Descrição",
            status: $rootScope.status.Rejeitado,
            url: "www.facebook.com",
            feedback: null,
        },
        {
            titulo: "Projeto5",
            descricao: "Descrição",
            status: $rootScope.status.Finalizado,
            url: "www.facebook.com",
            feedback: null,
        }
    ]

    $rootScope.novoProjeto = () => {
        $rootScope.projeto = {
            titulo: null,
            descricao: null,
            status: 1,
            url: null,
            feedback: null,
        }
    }

    $rootScope.novoUsuario = () => {
        $rootScope.usuario = {
            nome: null,
            email: null,
            rg: null,
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

    $rootScope.salvarUsuario = (usuario) => {
        if (usuario.nome == null || usuario.email == null || usuario.tipo == null) {
            notify({
                classes: "alert-warning",
                message: "Preencha os campos obrigatórios!"
            })
            return
        }
        if ($rootScope.usuarios.indexOf(usuario) == -1) {
            $rootScope.usuarios.push(usuario)
            notify({
                classes: "alert-success",
                message: "Salvo com sucesso!"
            })
            $('#collapseUsuarios').collapse("show")
            $('#collapseOne').collapse("hide")
            $rootScope.novoUsuario()

        } else {
            notify({
                classes: "alert-danger",
                message: "Já existe um registro com esses dados!"
            })
            $rootScope.novoUsuario()

        }

    }
    $rootScope.novoUsuario()

})