package lista3;

public class Exercicio19 {
	public static void main(String[] args) {
		int[][] matrizA = new int[4][4];
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				matrizA[i][y] = i * y;
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + i + y + "]");
				// System.out.print("["+matrizA[i][y]+"]");
			}
		}
		System.out.println("");
		System.out.println("\nMultiplicação da linha com a coluna");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				// System.out.print("["+i+y+"]");
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}
	}
}
/*
 * 19. Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da
 * linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
 */