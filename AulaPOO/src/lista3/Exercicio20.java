package lista3;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		int maior=0,lin=0,col=0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + y + "]=");
				matrizA[i][y] = scan.nextInt();
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
		System.out.println("MatrizA["+lin+"]["+col+"]="+ maior);
	}
}/*
	 * 20. Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e
	 * a coluna) do maior valor.
	 */