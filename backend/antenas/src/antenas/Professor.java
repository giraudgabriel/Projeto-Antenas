package antenas;

public class Professor {
	
	private DadosLogin dadosLogin;
	
	public Professor(DadosLogin dadosLogin) {
		this.setDadosLogin(dadosLogin);
	}
	
	public void setDadosLogin(DadosLogin dl) {
		this.dadosLogin = dl;
	}
	
	public DadosLogin getDadosLogin() {
		return this.dadosLogin;
	}

}
