package br.com.ranqueamentoderisco;
public class Moto extends Veiculo {
	private int cilindradas;

	public Moto() {
	}

	public Moto(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public Risco risco() {
		if(getValor() < 10000) {
			return Risco.BAIXO;
		}
		else if(getValor() > 10000 && getValor() < 35000) {
			return Risco.MEDIO;
		}
		return Risco.ALTO;
	}
}