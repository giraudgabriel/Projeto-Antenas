public class CADI
{
    private String email;
    private String senha;

    public CADI(String email,String senha)
    {
        this.email = email;
        this.senha = senha;
    }

    public void setSenha(String novaSenha)
    {
        this.senha = novaSenha;
    }
}