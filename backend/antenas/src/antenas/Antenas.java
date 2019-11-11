package antenas;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<CADI> cadis = new LinkedList<CADI>();
	
		
	public void addEmpresario(Empresario emp) {
		empresarios.add(emp);
	}
	
	
	public void addProjeto(Projeto proj) {
		projetos.add(proj);
	}
	
	public void addCADI(CADI cadi) {
		cadis.add(cadi);
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void addProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public List<Empresario> getEmpresarios(){
		return this.empresarios;
	}
	
	public List<CADI> getCadis(){
		return this.cadis;
	}
	
	public List<Professor> getProfessores(){
		return this.professores;
	}
	
	public List<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}
	
	public List<Projeto> buscarProjetos(){
		return this.projetos;
	}
	
	public List<Projeto> buscarProjetosPorEmpresario(String empresario) {
		return projetos.stream()
			    .filter(p -> p.getEmpresario().equals(empresario))
			    .collect(Collectors.toList());
	}
	
	
	public List<Projeto> buscarProjetosPorProfessor(String professor) {
		return projetos.stream()
			    .filter(p -> p.getProfessor().equals(professor))
			    .collect(Collectors.toList());
	}
	
	public List<Projeto> buscarProjetosPorAluno(String aluno) {
		return projetos.stream()
			    .filter(p -> p.getAlunos().equals(aluno))
			    .collect(Collectors.toList());
	}
			
	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario:empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}
	
	public Aluno loginAluno(DadosLogin dl) {
		for(Aluno aluno:alunos) {
			if(aluno.getDadosLogin().compararDadosLogin(dl)) return aluno;
		}
		return null;
	}
	
	public CADI loginCADI(DadosLogin dl) {
		for(CADI cadi: cadis) {
			if(cadi.getDadosLogin().compararDadosLogin(dl)) return cadi;
		}
		return null;
	}
	
	public Professor loginProfessor(DadosLogin dl) {
		for(Professor professor: professores) {
			if(professor.getDadosLogin().compararDadosLogin(dl)) return professor;
		}
		return null;
	}
	
	
}
