package antenas;

import java.util.LinkedList;
import java.util.List;

public class Projeto {


	private String empresario;
	private String descricao;
	private String link;
	private String chave;
	private int status;
	private List<Entrega> entregas = new LinkedList<Entrega>();
	private List<String> emailsAlunos = new LinkedList<String>();
	private String professor;


	public Projeto(String chave,String empresario,String descricao,String link) {
		this.chave = chave;
		this.empresario = empresario;
		this.descricao = descricao;
		this.link = link;
		this.status = 1;
	}
	
	public String getEmpresario() {
		return empresario;
	}

	public void setEmpresario(String empresario) {
		this.empresario = empresario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getChave() {
		return this.chave;
	}

	public List<Entrega> getEntregas() {
		return this.entregas;
	}

	public void addEntrega(Entrega entrega) {
		this.entregas.add(entrega);
	}
	
	public void addAluno(String emailAluno) {
		this.emailsAlunos.add(emailAluno);
	}
	
	public List<String> getAlunos() {
		return this.emailsAlunos;
	}

	public String getProfessor() {
		return this.professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getStatus() {
		if(this.status == 0)
			return "Desativado";
		else
			return "Fase " + this.status;
	}
	
}
