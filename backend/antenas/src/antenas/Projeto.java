package antenas;

import java.util.LinkedList;
import java.util.List;

public class Projeto {


	private Empresario empresario;
	private String descricao;
	private String link;
	private String chave;
	private List<Entrega> entregas = new LinkedList<Entrega>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private Professor professor;


	public Projeto(String chave,Empresario empresario,String descricao,String link) {
		this.chave = chave;
		this.empresario = empresario;
		this.descricao = descricao;
		this.link = link;
	}
	
	public Empresario getEmpresario() {
		return empresario;
	}


	public void setEmpresario(Empresario empresario) {
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
		return chave;
	}

	public List<Entrega> getEntregas() {
		return entregas;
	}

	public void addEntrega(Entrega entrega) {
		this.entregas.add(entrega);
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
