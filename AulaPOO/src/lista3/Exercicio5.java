package lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("!! Entre com o numero inteiro: ");
		numero = scan.nextInt();
		System.out.println(" Numero digitado é: " + numero);
		for (int i = 0; i <= numero; i++) {
			System.out.print(" " + i);
		}
	}
}
/*
 * 5. Faça um programa que leia um número inteiro positivo N e imprima todos os
 * números naturais de 0 até N em ordem crescente.
 */