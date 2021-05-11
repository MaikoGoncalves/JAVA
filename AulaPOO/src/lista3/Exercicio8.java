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
		System.out.print("\n Soma dos múltiplosde 3 e 5 abaixo de 1000 é: " + soma);
	}
}
/*
 * 8. Faça um programa que some todos os números naturais abaixo de 1000 que são
 * múltiplos de 3 ou 5.
 */