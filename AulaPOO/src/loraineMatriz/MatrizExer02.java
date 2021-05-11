package loraineMatriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[10][10];
		Random numeroRandom = new Random();
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = numeroRandom.nextInt(9);
			}
		}
		int maiorL5 = 0;
		int menorL5 = 10;
		for (int i = 0; i < matrizA[5].length; i++) {
			if (matrizA[5][i] > maiorL5) {
				maiorL5 = +matrizA[5][i];
			}
			if (matrizA[5][i] < menorL5) {
				menorL5 = +matrizA[5][i];
			}

		}
		int maiorC7 = 0;
		int menorC7 = 10;
		for (int i = 0; i < matrizA.length; i++) {
			if (matrizA[i][7] > maiorC7) {
				maiorC7 = +matrizA[i][7];
			}
			if (matrizA[i][7] < menorC7) {

				menorC7 = +matrizA[i][7];
			}

		}
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}
		System.out.println("\nO maior da linha 5 : " + maiorL5);
		System.out.println("O menor da linha 5 : " + menorL5);
		System.out.println("\nO maior da coluna 7 : " + maiorC7);
		System.out.println("O menor da coluna 7 : " + menorC7);
	}

}
