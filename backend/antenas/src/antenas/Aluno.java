package antenas;

public class Aluno {

    private DadosLogin dadosLogin;
    
    public Aluno(DadosLogin dadosLogin) {
    	this.setDadosLogin(dadosLogin);
    }

	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}

}
