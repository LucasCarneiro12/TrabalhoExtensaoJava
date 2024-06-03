package entities;

public class Locatario {
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	private String telefone;
	private double renda;
	private String profissao;

	public Locatario(String nome, String endereco, String cpf, String rg, String telefone, double renda,
			String profissao) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.renda = renda;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public double getRenda() {
		return renda;
	}

	public String getProfissao() {
		return profissao;
	}

}
