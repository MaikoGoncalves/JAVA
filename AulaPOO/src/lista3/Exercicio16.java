package lista3;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int maior, aux;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do VETOR A da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		maior = vetorA[0];
		aux = 0;
		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] >= maior) {
				maior = vetorA[i];
				aux = i;
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "]=" + vetorA[i]);
		}
		System.out.println("** Maior numero encontrado é: " + maior);
		System.out.println("** VetorA[" + aux + "]=" + maior);
		System.out.println("** Se encontra na " + aux + " posição.");

	}

}
/*
 * 16. Escreva um programa que leia 10 números inteiros e os armazene em um
 * vetor. Imprima o vetor, o maior elemento e a posição que ele se encontra.
 */