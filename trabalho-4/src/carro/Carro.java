package carro;

public class Carro {
	
		public String marca;
		public String modelo;
		public String cor;
		public String combustivel;
		
				
		public void ligar() {
		System.out.println(" Ligar ");
		}
		public void acelerar() {
		System.out.println(" Acelerar ");
		}
		public void frear() {
		System.out.println(" Frear ");
		}

		double obterAutonomia() {
        
		System.out.println(" Método obterAutonomia foi chamado.");			
		return 1;
		
		}
}		

