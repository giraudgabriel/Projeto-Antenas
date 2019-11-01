package antenas;
public class CADI
{
    private DadosLogin dadosLogin;

    public CADI(String email,String senha) {
        this.setDadosLogin(new DadosLogin(email,senha));
    }

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
	
	public DadosLogin getDadosLogin() {
		return this.dadosLogin;
	}
}
