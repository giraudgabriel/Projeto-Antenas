package antenas;

import java.util.LinkedList;
import java.util.List;

public class Projeto {


	private String dono;
	private String descricao;
	private String link;
	private String chave;
	private List<Entrega> entregas = new LinkedList<Entrega>();
	
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos

	public Projeto(String chave,String dono,String descricao,String link) {
		this.chave = chave;
		this.dono = dono;
		this.descricao = descricao;
		this.link = link;
	}
	
	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
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


	
	


	
	
	
	
	
}
