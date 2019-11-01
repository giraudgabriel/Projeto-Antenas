package antenas;
public class CADI
{
    private DadosLogin dadosLogin;

    public CADI(DadosLogin dadosLogin) {
        this.setDadosLogin(dadosLogin);
    }

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
	
	public DadosLogin getDadosLogin() {
		return this.dadosLogin;
	}
}
