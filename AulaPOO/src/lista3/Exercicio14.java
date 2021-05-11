package lista3;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int par = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do VETOR A da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.println("vetorA[" + i + "]=" + vetorA[i] + " e par");
				par++;
			}
		}
		System.out.println("O vetorA possui " + par + " numeros pares");
	}
}
/*
 * 14. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele
 * possui.
 */