package br.com.ranqueamentoderisco;
public abstract class Pessoa implements Ranqueavel {
	private int codigo;
	private String nome;
	private Endereco endereco;
	
	public Pessoa() {
	}

	public Pessoa(int codigo, String nome, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}