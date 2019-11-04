package antenas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Antenas antenas = new Antenas();
		
		//empresario
		
		Empresario novoEmpresario = new Empresario("123", new DadosLogin("joao@gmail.com", "456"));
		antenas.addEmpresario(novoEmpresario);
		
		antenas.addProjeto(new Projeto("abc",novoEmpresario,null,null));
		
		Projeto projeto = antenas.buscarProjetoPorChave("abc");
		
		List<Projeto> projetosDoEmpresario = antenas.buscarProjetosPorEmpresario(novoEmpresario);
		
		assertEquals(projetosDoEmpresario.size(),1);
		
		assertEquals(projeto.getChave(), "abc");
		
		Empresario emp = antenas.loginEmpresario(new DadosLogin("joao@gmail.com", "456"));
				
		assertEquals(emp, projeto.getEmpresario());
		
		assertEquals(emp.getCpf(), "123");
		
		assertEquals(antenas.getEmpresarios().size(), 1);
		
		
		//cadi
		
		CADI novoCADI = new CADI(new DadosLogin("cadi@gmail.com","123"));
		
		antenas.addCADI(novoCADI);
		
		CADI cadi = antenas.loginCADI(novoCADI.getDadosLogin());
		
		assertEquals(cadi, novoCADI);
		
		assertEquals(antenas.getCadis().size(),1);
		
		
		//professor
		
		Professor novoProfessor = new Professor(new DadosLogin("professor@gmail.com","123"));
		
		antenas.addProfessor(novoProfessor);
		
		Professor professor = antenas.loginProfessor(novoProfessor.getDadosLogin());
		
		projeto.setProfessor(professor);
		
		List<Projeto> projetosDoProfessor = antenas.buscarProjetosPorProfessor(novoProfessor);
		
		assertEquals(projetosDoProfessor.size(), 1);
		
		assertEquals(professor,projeto.getProfessor());
		
		assertEquals(antenas.getProfessores().size(),1);
		

		//aluno
		Aluno novoAluno = new Aluno(new DadosLogin("gabriel@gmail.com","123"));
		antenas.addAluno(novoAluno);
		
		Aluno aluno = antenas.loginAluno(novoAluno.getDadosLogin());
		
		projeto.addAluno(aluno);
		
		List<Projeto> projetosDoAluno = antenas.buscarProjetosPorAluno(novoAluno);
		
		assertEquals(projetosDoAluno.size(), 1);
		
		assertEquals(aluno, projeto.getAlunos().get(0));
		
		assertEquals(antenas.getAlunos().size(), 1);
		
		projeto.addEntrega(new Entrega("github.com",null,null,aluno));
		
		assertEquals(projeto.getEntregas().size(),1);
		
		
	}

}
