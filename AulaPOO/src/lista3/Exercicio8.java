package lista3;

public class Exercicio8 {
	public static void main(String[] args) {
		int y = 1, numero = 0, soma = 0;
		do {
			if ((y % 3 == 0) || (y % 5 == 0)) {
				soma = soma + y;
				System.out.println("valor:" + y);
				numero++;
				y++;
			} else
				y++;
		} while (y <= 1000);
		System.out.print("\n Qtd de numeros " + numero);
		System.out.print("\n Soma dos m�ltiplosde 3 e 5 abaixo de 1000 �: " + soma);
	}
}
/*
 * 8. Fa�a um programa que some todos os n�meros naturais abaixo de 1000 que s�o
 * m�ltiplos de 3 ou 5.
 */