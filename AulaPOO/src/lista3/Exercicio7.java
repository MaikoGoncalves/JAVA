package lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, par = 0, impar = 0, qtd = 0;
		do {
			System.out.println("Entre com o numero inteiro quando quiser sair digite 1000");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " digitado � par\n");
				par++;
				qtd++;
			} else {
				System.out.print("O numero " + numero + " digitado � impar\n");
				impar++;
				qtd++;
			}
		} while (numero != 1000);
		System.out.print("\n Qtd Numeros digitados " + qtd);
		System.out.print("\n Qtd Par " + par);
		System.out.print("\n Qtd Impar " + impar);
	}
}
/*
 * 7. Ler uma sequ�ncia de n�meros inteiros e determinar se eles s�o pares ou
 * n�o. Dever� ser informado o n�mero de dados lidos e n�mero de valores pares.
 * O processo termina quando for digitado o n�mero 1000.
 */