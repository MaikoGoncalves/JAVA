package lista3;

public class Exercicio4 {
	public static void main(String[] args) {
		int y = 1, par = 0, soma = 0;
		do {
			if (y % 2 == 0) {
				soma = soma + y;
				System.out.println("valor:" + y);
				par++;
				y++;
			}
			y++;
		} while (par < 50);
		System.out.print("\n Qtd Par somada é: " + par);
		System.out.print("\n Soma dos 50 primeiros numeros pares é: " + soma);
	}
}
/*
 * 4. Faça um programa que calcule e mostre a soma dos 50 primeiros números
 * pares.
 */