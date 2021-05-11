package lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  numero1, numero2, somapar = 0, j = 0, z = 0, aux;
		long somaimpar=1;
		System.out.println(" Entre com um numero");
		numero1 = scan.nextInt();
		System.out.println(" Entre com outro numero");
		numero2 = scan.nextInt();
		if (numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		if (numero1 < numero2) {
			int[] vetorP = new int[numero2];
			int[] vetorI = new int[numero2];
			for (int i = numero1; i <= numero2; i++) {
				if (i % 2 == 0) {
					somapar = somapar + i;
					vetorP[j] = i;
					j++;
				} else {
					vetorI[z] = i;
					z++;
					somaimpar = somaimpar * i;
				}
			}
			System.out.println(" ");
			System.out.println("** No intervalo do numero " + numero1 + " até o numero " + numero2);
			System.out.print("** Possui estes numeros pares : ");
			for (int i = 0; i < j; i++) {
				System.out.print(vetorP[i] + " ");
			}
			System.out.println("\n** A Soma dos numeros pares é: " + somapar);
			System.out.println(" ");
			System.out.println("** No intervalo do numero " + numero1 + " até o numero " + numero2);
			System.out.print("** Possui estes numeros impares : ");
			for (int i = 0; i < z; i++) {
				System.out.print(vetorI[i] + " ");
			}
			System.out.println("\n** A Multiplicação dos numeros impares é: " + somaimpar);
		}
	}
}
/*
 * 10. Faça um programa que receba dois números. Calcule e mostre: a) a soma dos
 * números pares desse intervalo de números, incluindo os números digitados; b)
 * a multiplicação dos números ímpares desse intervalo, incluindo os digitados;
 */