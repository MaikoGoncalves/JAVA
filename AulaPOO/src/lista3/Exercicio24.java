package lista3;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		int soma = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + y + "]=");
				matrizA[i][y] = scan.nextInt();
			}
		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				if (i == y) {
					soma += matrizA[i][y];
				}
			}
		}
		System.out.println("");
		System.out.println("Matriz A digitada");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}
		System.out.println("\nA soma dos elementos na diagonal principal " + soma);
	}
}
/*
 * 24. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que
 * estão na diagonal principal.
 */