package br.com.ranqueamentoderisco;
public class Endereco {
	private String cep;
	private String logradouro;
	private String bairro;
	private String uf;
	private String cidade;
	
	public Endereco() {
	}

	public Endereco(String cep, String logradouro, String bairro, String uf, String cidade) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.uf = uf;
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}