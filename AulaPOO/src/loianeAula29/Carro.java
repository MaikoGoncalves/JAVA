package loianeAula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	Double capComb;
	Double conComb;

	Carro(){
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	Carro(String marca_, String modelo_){
		marca = marca_;
		modelo= modelo_;
	}
	
	
	void exibirAutonomia() {
	System.out.println("A autonomia do carro é: " + capComb * conComb);
	}
	
	
	

}
