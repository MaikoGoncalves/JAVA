package loianeAula31;

public class Carro {

    public  String marca;
	        String modelo;
    private int numPassageiros;
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
 
	public void exibirAutonomia() {
		System.out.println(" A autonomia do carro é: " + this.capComb * this.conComb);
	}
	
	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado");
		return this.capComb * this.conComb;
	}
	
	
	private double divideKMPorConsumo(double km) {
        return km/this.conComb;
	}

    public double calcularCombustivel(double km) {
    	return this.divideKMPorConsumo(km);
    }
	
	
}


