package lista3;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] matrizA = new double[2][6];
		double[][] matrizB = new double[2][1];
		double[][] matrizC = new double[2][1];
		double soma = 0, soma2=0, soma4=0,media2=0,media4=0;
		for (int i = 0; i < matrizA.length; i++) {
		for (int y = 0; y < matrizA[i].length; y++) {
				System.out.print("Entre com um valor matrizA[" + i + "][" + y + "]=");
				matrizA[i][y] = scan.nextInt();
			}
		}
		//matrizA 2.6
		System.out.println("");
		System.out.println("** MatrizA **");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizA[i].length; j++) {
			System.out.print("[" + matrizA[i][j] + "]");
			if(j % 2 !=0) {
			soma+=matrizA[i][j];
			}
		   }
		}
		System.out.println("");
		System.out.println("*** Soma colunas impar ***");
      	System.out.println("A soma dos elementos das colunas impar é: " + soma);
      	
      	//matrizB 2.1
      	System.out.println("");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
			int y=2;
			matrizB[i][j]=matrizA[i][y];
			}
		}
		System.out.println("");
		System.out.println("MatrizA ** coluna 2** ");
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizB[i].length; j++) {
			System.out.print("[" + matrizB[i][j] + "]");
			soma2=soma2+matrizB[i][j];
			}
		}media2=soma2/2;
		System.out.println("");
		System.out.println("A media da coluna 2 é: " + media2);
		
		
		//matrizC 2.1
		System.out.println("");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
			int y=4;
			matrizC[i][j]=matrizA[i][y];
			
			}
		}
		System.out.println("");
		System.out.println("MatrizA **coluna 4**");
		for (int i = 0; i < matrizC.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizC[i].length; j++) {
			System.out.print("[" + matrizC[i][j] + "]");
			soma4=soma4+matrizC[i][j];
			}
		}media4=soma4/2;
		System.out.println("\nA media da coluna 4 é: " + media4);
		//matrizA modificada 
		System.out.println("");
		System.out.println("** MatrizA modificada**");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrizA[i].length; j++) {
			if(j == 5) {
			matrizA[i][j]=matrizA[i][1]+matrizA[i][2];
			}System.out.print("[" + matrizA[i][j] + "]");
		   }
		}
	}      	
}
/*. Faça um programa que leia uma matriz 3 x 6 com valores reais.
• Imprima a soma de todos os elementos das colunas ímpares.
• Imprima a média aritmética dos elementos da segunda e quarta colunas.
• Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
• Imprima a matriz modificada.*/