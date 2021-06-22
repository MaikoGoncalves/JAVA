package atividades;

import java.util.Locale;
import java.util.Scanner;
import calculadora.Calculadora1;

public class Atividade1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora1 calc = new Calculadora1();
		System.out.print("Informe o Raio: ");
		double raio = sc.nextDouble();
		double c = calc.circuferencia(raio);
		double v = calc.volume(raio);
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("valor do PI: %.2f%n", calc.PI);
		sc.close();
	}
}