package antenas;

public class Projeto {

	private String key;
	private String owner;
	private String smallDesc;
	private String externalLink;
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos

	public Projeto(String key,String owner,String smallDesc,String externalLink) {
		this.key = key;
		this.owner = owner;
		this.externalLink = externalLink;
		this.smallDesc = smallDesc;
	}

	public String getkey() {
		return key;
	}

	public void setkey(String key) {
		this.key = key;
	}

	public String getowner(){
		return owner;
	}

	public String getSD(){
		return smallDesc;
	}

	public void editSD(String NewSD){
		this.smallDesc = NewSD;
	}

	public String getLink(){
		return externalLink;
	}


	
	


	
	
	
	
	
}
