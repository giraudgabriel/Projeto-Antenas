package antenas;

public class Projeto {

	private String chave;
	private String dono;
	private String smallDesc;
	private String externalLink;
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos

	public Projeto(String chave,String dono,String smallDesc,String externalLink) {
		this.chave = chave;
		this.dono = dono;
		this.externalLink = externalLink;
		this.smallDesc = smallDesc;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getDono(){
		return dono;
	}

	public String getSD(){
		return smallDesc;
	}

	public void editSD(String NewSD){
		this.smallDesc = NewSD;
	}

	public String getLink()
	{
		return externalLink;
	}


	
	


	
	
	
	
	
}
