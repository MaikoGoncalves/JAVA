package lista3;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[8];
		int x, y, soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do VETOR A da posi��o " + i+" : ");
			vetorA[i] = scan.nextInt();
		}
		System.out.print("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "]");
		}
		System.out.println("");
		System.out.println("\nEntre com uma posi��o de 0 a 7");
		x = scan.nextInt();
		System.out.println("Entre com uma posi��o de 0 a 7");
		y = scan.nextInt();
		System.out.println("");
		
		if (x >= 0 && x < 8 && y >= 0 && y < 8) {
			soma = vetorA[x] + vetorA[y];
			System.out.println("A soma da posi��o do vetorA[" + (x) + "] = " + vetorA[x]+ " com a posi��o do vetorA[" + (y) + "] = " + vetorA[y] + " �: " + soma);
		} else {
			System.out.println("Numero digitado errado para posi��o");
		}
	}
}
/*
 * 13. Fa�a um programa que leia um vetor de 8 posi��es e, em seguida, leia
 * tamb�m dois valores X e Y quaisquer correspondentes a duas posi��es no vetor.
 * Ao final seu programa dever� escrever a soma dos valores encontrados nas
 * respectivas posi��es X e Y.
 */