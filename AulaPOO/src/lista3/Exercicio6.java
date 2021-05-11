package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, z;
		System.out.println("!! Entre com o numero inteiro: ");
		numero = scan.nextInt();
		System.out.println(" Numero digitado é: " + numero);
		z = numero;
		for (int i = 0; i <= numero; i++) {
			System.out.print(" " + z);
			z--;
		}
	}
}
/*
 * Faça um programa que leia um número inteiro positivo N e imprima todos os
 * números naturais de 0 até N em ordem decrescente.
 */