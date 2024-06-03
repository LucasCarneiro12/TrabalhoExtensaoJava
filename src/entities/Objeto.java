package entities;

public class Objeto {
	
	private String endereco;
	private String inscricaoIPTU;

	public Objeto(String endereco, String inscricaoIPTU) {
		this.endereco = endereco;
		this.inscricaoIPTU = inscricaoIPTU;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getInscricaoIPTU() {
		return inscricaoIPTU;
	}


}
