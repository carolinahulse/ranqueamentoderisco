package br.com.ranqueamentoderisco;
public class SistemaDeRanqueamento {
	
	public void processar(Ranqueavel ranqueavel) {
		System.out.println("Classificação: "+ranqueavel.risco());
	}
}