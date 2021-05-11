package lista3;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[6];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do VETOR A da posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		System.out.print("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "]");
		}
	}

}
/*
 * 12. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela
 * os valores lidos.
 */