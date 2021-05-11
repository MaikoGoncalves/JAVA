package lista3;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[5][5];
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				if (i == y) {
					matrizA[i][y] = 1;
				}
				if (i != y) {
					matrizA[i][y] = 0;
				}
			}
		}
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}
	}
}
/*
 * 18. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
 * demais elementos. Escreva ao final a matriz obtida.
 */