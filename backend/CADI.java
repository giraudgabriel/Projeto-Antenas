public class CADI
{
    private String email;
    private String senha;

    public CADI(String email,String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    public void setemail(String novoEmail){
        this.email = novoEmail;
    }
    public getEmail(){
        return email;
    }
    public getSenha(){
        return senha;
    }


}