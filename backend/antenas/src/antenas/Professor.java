package antenas;

public class Professor {
	
	private DadosLogin dadosLogin;
	
	public Professor(String email, String senha) {
		this.setDadosLogin(new DadosLogin(email,senha));
	}
	
	public void setDadosLogin(DadosLogin dl) {
		this.dadosLogin = dl;
	}
	
	public DadosLogin getDadosLogin() {
		return this.dadosLogin;
	}

}
