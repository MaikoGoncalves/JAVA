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
			System.out.println(" A �rea do triangulo �: " + area);
		} else {
			System.out.println(" Valores digitado errado");
		}
	}
}
/*
 * 9. Fa�a um programa que calcule a �rea de um tri�ngulo, cuja base e altura
 * s�o fornecidas pelo usu�rio. Esse programa n�o pode permitir a entrada de
 * dados inv�lidos, ou seja, medidas menores ou iguais a 0.
 */