package lista3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[6];
		int soma = 0;
		vetorA[0] = 1;
		vetorA[1] = 0;
		vetorA[2] = 5;
		vetorA[3] = -2;
		vetorA[4] = -5;
		vetorA[5] = 7;
		System.out.println("** Vetor A **");
		for (int i = 0; i < 6; i++) {
			System.out.print("vetorA[" + i + "]= ");
			System.out.print(vetorA[i] + "  ");
		}
		soma = vetorA[0] + vetorA[1] + vetorA[5];
		System.out.print("\n\n** A Soma das posi��es A[0], A[1] e A[5] do vetor � : " + soma + "\n");
		System.out.println("\n** Novo Vetor **");
		vetorA[3] = 100;
		for (int i = 0; i < 6; i++) {
			System.out.print("vetorA[" + i + "]=");
			System.out.print(vetorA[i] + "   ");
		}

	}
}
/*
 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
 * inteiros. O programa deve executar os seguintes passos: a) Atribua os
 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. b) Armazene em uma
 * vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e
 * A[5] do vetor e mostre na tela esta soma. c) Modifique o vetor na posi��o 4,
 * atribuindo a esta posi��o o valor 100.
 * 
 */