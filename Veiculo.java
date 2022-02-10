package br.com.ranqueamentoderisco;
public abstract class Veiculo implements Ranqueavel {
	private int codigo;
	private String fabricante;
	private double valor;
	private String renavam;
	
	public Veiculo() {
	}

	public Veiculo(int codigo, String fabricante, double valor, String renavam) {
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.valor = valor;
		this.renavam = renavam;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
}