package antenas;

import java.util.LinkedList;
import java.util.List;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<CADI> membrosCADI = new LinkedList<CADI>();
	
		
	public void addEmpresario(Empresario emp) {
		empresarios.add(emp);
	}
	
	
	public void addProjeto(Projeto proj) {
		projetos.add(proj);
	}
	
	public void addCADI(CADI cadi) {
		membrosCADI.add(cadi);
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
	
	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}
	
	//2. Implemente o método _(loginEmpresario)_ e seu método de dependência _(compararDadosLogin)_ 
	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario:empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}
	
	
}
