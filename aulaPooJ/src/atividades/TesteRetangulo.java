package atividades;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		
		Retangulo retA = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Altura do retangulo");
		retA.alt = sc.nextDouble();
		System.out.println("Entre com o Comprimento do retangulo");
		retA.comp = sc.nextDouble();

		retA.calcularArea();
		retA.calcularPerimetro();
		retA.calcularDiagonal();
		//double Area = retA.calcularArea();
		System.out.println("Altura = "+ retA.alt);
		System.out.println("Comprimento = "+ retA.comp);
		System.out.println("Area �: "+ retA.calcularArea());
		System.out.println("Perimetro �: "+ retA.calcularPerimetro());
		System.out.println("Diagonal �: "+ retA.calcularDiagonal());
		
	}
}
