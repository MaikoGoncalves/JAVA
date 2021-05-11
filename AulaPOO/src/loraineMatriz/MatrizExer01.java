package loraineMatriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExer01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		Random numeroRandom = new Random();
		int maior = 0;
		int lin = 0;
		int col = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = numeroRandom.nextInt(100);//100 posso mudar.
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j] > maior) {
					maior = matrizA[i][j];
					lin = i;
					col = j;
				}
			}
		}
		System.out.println("\n");
		System.out.println("O maior numero é: " + maior);
		System.out.println("A linha é: " + lin);
		System.out.println("A coluna é: " + col);
	}

}
