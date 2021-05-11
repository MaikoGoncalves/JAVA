package lista3;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		int soma = 0;
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + y + "]=");
				matrizA[i][y] = scan.nextInt();
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
		System.out.print("Numeros maiores que 10");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int y = 0; y < matrizA[i].length; y++) {
				if(matrizA[i][y]>10) {
				soma++;	
				System.out.print("[" + matrizA[i][y] + "]");
			}
		  }	
		}
		System.out.println("\nQTD de numeros maiores que 10: " + soma);
	}
}
/*26. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.*/