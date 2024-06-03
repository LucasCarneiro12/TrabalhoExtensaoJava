package entities;

public class Locador {
		private String nome;
		private String endereco;
		private String cpf;

		public Locador(String nome, String endereco, String cpf) {
			this.nome = nome;
			this.endereco = endereco;
			this.cpf = cpf;
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
	}

