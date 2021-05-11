package loraineMatriz;

import java.util.Scanner;

public class MatrizExer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] jogo = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		System.out.println();
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		while (!ganhou) {
			if (jogada % 2 == 1) {// jogador 1
				
				System.out.println(" Vez do jogador 1. Escolha linha e coluna.");
				sinal = 'X';
			} else {
				System.out.println(" Vez do jogador 2. Escolha linha e coluna.");
				sinal = 'O';
			}
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println(" Entre com a linha (1,2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println(" Entrada inválida, tente novamente");
				}
			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println(" Entre com a coluna (1,2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println(" Entrada inválida, tente novamente");
				}
			}
		linha--;
		coluna--;
		if(jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O') {
		System.out.println("Posição já usada, tente novamente");
		}else {
			jogo[linha][coluna] = sinal;
			jogada++;
		}

        // imprimir tabuleiro
		System.out.println();
		for (int i=0; i < jogo.length; i++) {
			for (int j=0; j<jogo[i].length; j++) {
		         System.out.print(jogo[i][j]+ " | ");		
			}
		    System.out.println();
		}
		System.out.println();

		
		
		}

	}

}
