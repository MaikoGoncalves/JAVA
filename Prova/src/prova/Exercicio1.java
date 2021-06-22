package prova;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		ProvaExer1 p = new ProvaExer1();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite valor de A.");
		p.setA(scan.nextDouble());

		System.out.println("Digite valor de B.");
		p.setB(scan.nextDouble());

		System.out.println("Digite valor de C.");
		p.setC(scan.nextDouble());

		p.setConc();
		p.setValorDelta();

	}

}
