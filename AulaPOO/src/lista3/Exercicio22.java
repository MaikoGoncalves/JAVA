package lista3;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		int[][] matrizB = new int[matrizA.length][matrizA.length];
		int[][] matrizC = new int[matrizA.length][matrizA.length];

		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + y + "]=");
				matrizA[i][y] = scan.nextInt();
			}
		}
		System.out.println("");
		for (int i = 0; i < matrizB.length; i++) {
			for (int y = 0; y < matrizB[i].length; y++) {
				System.out.print("Entre com um valor matrizB[" + i + "][" + y + "]=");
				matrizB[i][y] = scan.nextInt();
			}
		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				if (matrizA[i][y] > matrizB[i][y]) {
					matrizC[i][y] = matrizA[i][y];
				} else {
					matrizC[i][y] = matrizB[i][y];
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
		System.out.println("\n");
		System.out.println("Matriz B digitada");
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizB[i].length; y++) {
				System.out.print("[" + matrizB[i][y] + "]");
			}
		}
		System.out.println("\n");
		System.out.println("Matriz C Formada");
		for (int i = 0; i < matrizC.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizC[i].length; y++) {
				System.out.print("[" + matrizC[i][y] + "]");
			}
		}

	}

}
/*22. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição
das matrizes lidas.
*/