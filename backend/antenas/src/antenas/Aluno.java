package antenas;

public class Aluno {

    private DadosLogin dadosLogin;
    
    public Aluno(DadosLogin dados) {
    	this.dadosLogin = dados;
    }

	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
}
