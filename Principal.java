package br.com.ranqueamentoderisco;
public class Principal {
	
	public static void main(String[] args) {
		Veiculo sandero = new Carro();
		sandero.setValor(25000);
		
		Veiculo pajero = new Carro();
		pajero.setValor(120000);
		
		Veiculo biz = new Moto();
		biz.setValor(8000);
		
		Veiculo kavazaki = new Moto();
		kavazaki.setValor(180000);
		
		SistemaDeRanqueamento sistema = new SistemaDeRanqueamento();
		sistema.processar(sandero);
		sistema.processar(pajero);
		sistema.processar(biz);
		sistema.processar(kavazaki);
	}
}