package br.com.ranqueamentoderisco;
public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String cnpj;
	private int tempoExperiencia;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String razaoSocial, String cnpj, int tempoExperiencia) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tempoExperiencia = tempoExperiencia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}

	public Risco risco() {
		if(tempoExperiencia < 3) {
			return Risco.ALTO;
		}
		else if(tempoExperiencia  > 3 && tempoExperiencia < 6) {
			return Risco.MEDIO;
		}
		return Risco.BAIXO;
	}
}