package lista3;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[5][5];
		int lin = 0, col = 0, buscar, nao = 0;
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
		System.out.print("\n\nEntre com um numero a ser buscado: ");
		buscar = scan.nextInt();
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				if (matrizA[i][y] == buscar) {
					lin = i;
					col = y;
					nao++;
				}
			}
		}
		if (nao > 0) {
			System.out.println("A matrizA[" + lin + "][" + col + "] = " + buscar);
			System.out.println("A linha é: " + lin);
			System.out.println("A coluna é: " + col);
		} else
			System.out.println("\nNão encontrado na Matriz");
	}

}/*
	 * 21. Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer
	 * uma busca desse valor na matriz e, ao final, escrever a localização (linha e
	 * coluna) ou uma mensagem de “não encontrado”.
	 */
