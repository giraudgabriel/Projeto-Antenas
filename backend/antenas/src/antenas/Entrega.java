package antenas;

public class Entrega {
	private String urlGit;
	private String urlDeploy;
	private String texto;
	private String emailAluno;
	
	public Entrega(String urlGit, String urlDeploy, String texto, String emailAluno) {
		this.setUrlGit(urlGit);
		this.setUrlDeploy(urlDeploy);
		this.setEmailAluno(emailAluno);
		this.setTexto(texto);
	}

	public String getUrlGit() {
		return urlGit;
	}

	public void setUrlGit(String urlGit) {
		this.urlGit = urlGit;
	}

	public String getUrlDeploy() {
		return urlDeploy;
	}

	public void setUrlDeploy(String urlDeploy) {
		this.urlDeploy = urlDeploy;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getEmailAluno() {
		return this.emailAluno;
	}

	public void setEmailAluno(String aluno) {
		this.emailAluno = aluno;
	}
}
