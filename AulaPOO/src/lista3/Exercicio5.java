package lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("!! Entre com o numero inteiro: ");
		numero = scan.nextInt();
		System.out.println(" Numero digitado �: " + numero);
		for (int i = 0; i <= numero; i++) {
			System.out.print(" " + i);
		}
	}
}
/*
 * 5. Fa�a um programa que leia um n�mero inteiro positivo N e imprima todos os
 * n�meros naturais de 0 at� N em ordem crescente.
 */