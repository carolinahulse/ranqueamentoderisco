package br.com.ranqueamentoderisco;
public class Carro extends Veiculo {
	private int ano;
	private QtdPortas portas;
	
	public Carro() {
	}

	public Carro(int ano, QtdPortas portas) {
		this.ano = ano;
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public QtdPortas getPortas() {
		return portas;
	}
	public void setPortas(QtdPortas portas) {
		this.portas = portas;
	}

	public Risco risco() {
		if(getValor() < 20000) {
			return Risco.BAIXO;
		}
		else if(getValor() > 20000 && getValor() < 55000) {
			return Risco.MEDIO;
		}
		return Risco.ALTO;
	}
}