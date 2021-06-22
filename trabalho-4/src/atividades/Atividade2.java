package atividades;

import java.util.Locale;
import java.util.Scanner;

import calculadora.Calculadora2;

public class Atividade2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o Raio: ");
		double raio = sc.nextDouble();
		double c = Calculadora2.circuferencia(raio);
		double v = Calculadora2.volume(raio);
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("valor do PI: %.2f%n", Calculadora2.PI);
		sc.close();
	}
}
