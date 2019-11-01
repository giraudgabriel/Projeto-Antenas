package antenas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Antenas antenas = new Antenas();
		
		//empresario
		antenas.addEmpresario(new Empresario("123", new DadosLogin("joao@gmail.com", "456"))); //obviamente isso vai mudar porque o empresario...
		
		antenas.addProjeto(new Projeto("abc", null, null, null));
		
		Projeto projeto = antenas.buscarProjetoPorChave("abc");

		assertEquals(projeto.getChave(), "abc");
		
		Empresario emp = antenas.loginEmpresario(new DadosLogin("joao@gmail.com", "456"));
		
		assertEquals(emp.getCpf(), "123");
		
		assertEquals(antenas.getEmpresarios().size(), 2);
		
		
		//cadi
		CADI novoCADI = new CADI(new DadosLogin("cadi@gmail.com","123"));
		
		antenas.addCADI(novoCADI);
		
		CADI cadi = antenas.loginCADI(novoCADI.getDadosLogin());
		
		assertEquals(antenas.getCadis().size(),1);
		
		//professor

		//aluno
		Aluno novoAluno = new Aluno(new DadosLogin("gabriel@gmail.com","123"));
		antenas.addAluno(novoAluno);
		
		Aluno aluno = antenas.loginAluno(novoAluno.getDadosLogin());
		
		assertEquals(antenas.getAlunos().size(), 1);
	
		
		//obviamente, fazer mais testes...
		
	}

}
