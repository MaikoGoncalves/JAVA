package lista3;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println("Usando repetição FOR:");
		for (int i = 1; i <= 100; i++) {
			System.out.print(" " + i);
		}

		System.out.println("\n\nUsando repetição WHILE:");
		int i = 1;
		while (i <= 100) {
			System.out.print(" " + i);
			i++;
		}

		System.out.println("\n\nUsando repetição DO WHILE:");
		int y = 1;
		do {
			System.out.print(" " + y);
			y++;
		} while (y <= 100);
	}
}
/*
 * Implemente um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes.
 * A primeira vez deve usar a estrutura de repetição for, a segunda while, e a
 * terceira do while.
 */