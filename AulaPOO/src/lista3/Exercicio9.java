package lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b, a;
		float area;
		System.out.println(" Entre com a Base do triangulo");
		b = scan.nextInt();
		System.out.println(" Entre com a Altura do triangulo");
		a = scan.nextInt();
		if ((b > 0) && (a > 0)) {
			area = (b * a) / 2;
			System.out.println(" A área do triangulo é: " + area);
		} else {
			System.out.println(" Valores digitado errado");
		}
	}
}
/*
 * 9. Faça um programa que calcule a área de um triângulo, cuja base e altura
 * são fornecidas pelo usuário. Esse programa não pode permitir a entrada de
 * dados inválidos, ou seja, medidas menores ou iguais a 0.
 */