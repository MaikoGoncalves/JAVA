package aulaPooJ;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		Carro a = new Carro();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o modelo do carro");
		a.modelo = sc.nextLine();
		System.out.println("Digite a marca do carro");
		a.marca = sc.nextLine();
		System.out.println("Digite o numero de passageiros");
		a.numPas = sc.nextInt();
		System.out.println("Digite a Capacidade de litros de combustivel");
		a.capComb = sc.nextDouble();
		System.out.println("Digite a autonomia por litro");
		a.conComb = sc.nextDouble();
		a.exibirAutonomia();
		System.out.println(a.modelo);
	}
	
}
