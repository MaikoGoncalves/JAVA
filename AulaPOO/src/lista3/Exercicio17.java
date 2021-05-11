package lista3;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[6];
		int[] vetorB = new int[vetorA.length];
		int y = 0, x = 0;
		// Entrada do Vetor
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do VETOR A da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		// Mostrando na tela o vetor
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "]=" + vetorA[i]);
		}
		// Mostrando o vetor em ordem inversa
		System.out.println("");
		System.out.println("** VetorA em ordem inversa **");
		y = vetorA.length - 1;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + y + "]=" + vetorA[y]);
			y--;
		}
		// Criei um vetorB para receber as informações do vetorA
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
		System.out.println("");
		System.out.println("**Utilizando outro vetor**");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorB[" + i + "]=" + vetorB[i]);
		}
	}
}
/*
 * 17. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela
 * os valores lidos na ordem inversa.
 */