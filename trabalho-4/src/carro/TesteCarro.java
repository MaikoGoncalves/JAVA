package carro;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carroA = new Carro();
		Carro carroB = new Carro();
		
		carroA.marca = "Ford";
        carroA.modelo = "Fiesta";
        carroA.cor = "Branco";
        carroA.combustivel = "Gasolina";
        
        carroB.marca = "Mitsubishi";
        carroB.modelo = "L-200";
        carroB.cor = "Azul Royal";
        carroB.combustivel = "Diesel";

        System.out.println(carroA.marca);
        System.out.println(carroA.modelo);
        System.out.println(carroA.cor);
        System.out.println(carroA.combustivel);
    
        System.out.println("Voc? deseja ligar o carro.");
        boolean teste = sc.nextBoolean();
        
        if(teste=true) {
        carroA.ligar();
        carroA.acelerar();
        carroA.frear();
        }
        
        
        System.out.println();
        System.out.println(carroB.marca);
        System.out.println(carroB.modelo);
        System.out.println(carroB.cor);
        System.out.println(carroB.combustivel);
        carroB.ligar();
        carroB.acelerar();
        carroB.frear();
	
	}
}