package br.com.ranqueamentoderisco;
public class PessoaFisica extends Pessoa {
	private int idade;
	private String cpf;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(int idade, String cpf) {
		this.idade = idade;
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Risco risco() {
		if(idade < 18) {
			return Risco.ALTO;
		}
		else if(idade > 18 && idade < 40) {
			return Risco.MEDIO;
		}
		return Risco.BAIXO;
	}
}