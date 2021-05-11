package aulaPooJ;

public class Carro {
	
	public String marca;
	public String modelo;
	public int numPas;
	public Double capComb;
	public Double conComb;
	
	public void exibirAutonomia() {
	System.out.println("A autonomia do carro é: " + capComb * conComb);
	}
}
