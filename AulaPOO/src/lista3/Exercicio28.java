package lista3;

public class Exercicio28 {

	public static void main(String[] args) {
		double[][] matrizA = new double[10][10];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (i < j) {
					matrizA[i][j] = (2 * i + 7 * j) - 2;
				}
				if (i == j) {
					matrizA[i][j] = (3 * (Math.pow(i, 2)) - 1);
				}
				if (i > j) {
					matrizA[i][j] = ((4 * (Math.pow(i, 3))) - (5 * (Math.pow(j, 2))) + 1);
				}
			}
		}
		System.out.println("");
		System.out.println("MatrizA Formatada");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("[" + matrizA[i][y] + "]");
			}
		}

	}
}
/*
 * 28. Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são
 * da forma: • A[i][j] = 2i + 7j − 2 se i < j; • A[i][j] = 3i 2 − 1 se i = j; •
 * A[i][j] = 4i3 − 5j2 + 1 se i > j.
 */