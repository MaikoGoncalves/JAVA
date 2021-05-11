package loraineMatriz;

import java.util.Scanner;

public class MatrizExer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + j + "]=");
				matrizA[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("[" + matrizA[i][j] + "]");
			}
		}
		int qtdP=0;
		int qtdI=0;
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizA[i].length; j++) {
				if(matrizA[i][j] % 2 ==0) {
					qtdP++;
				}else qtdI++;
				
				
			}
		}
	
		System.out.println("\nQtd numero par: " + qtdP);
		System.out.println("Qtd numero impar: " + qtdI);
	
	
	}

}
