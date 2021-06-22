package loianeAula30;

public class Carro {

      String marca;
	  String modelo;
	  int numPassageiros;
	  Double capComb;
	  Double conComb;
	
	public Carro(String marca, String modelo, int numPassageiros, Double capComb, Double conComb) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capComb = capComb;
		this.conComb = conComb;
	}
	
	public Carro(){ }
	
	Carro(String marca, String modelo){
		this.marca = marca;
		this.modelo= modelo;
	}
}
