package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, z;
		System.out.println("!! Entre com o numero inteiro: ");
		numero = scan.nextInt();
		System.out.println(" Numero digitado �: " + numero);
		z = numero;
		for (int i = 0; i <= numero; i++) {
			System.out.print(" " + z);
			z--;
		}
	}
}
/*
 * Fa�a um programa que leia um n�mero inteiro positivo N e imprima todos os
 * n�meros naturais de 0 at� N em ordem decrescente.
 */