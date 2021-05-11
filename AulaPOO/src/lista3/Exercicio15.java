package lista3;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int maior, menor;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do VETOR A da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		maior = vetorA[0];
		menor = vetorA[0];
		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] >= maior) {
				maior = vetorA[i];
			}
			if (vetorA[i] <= menor) {
				menor = vetorA[i];
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "]=" + vetorA[i]);
		}
		System.out.println("Maior numero encontrado é: " + maior);
		System.out.println("Menor numero encontrado é: " + menor);
	}
}
/*
 * 15. Faça um programa que receba do usuário um vetor com 10 posições. Em
 * seguida deverá ser impresso o maior e o menor elemento do vetor.
 */