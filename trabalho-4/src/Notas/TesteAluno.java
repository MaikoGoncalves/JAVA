package Notas;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		a.nome = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite A nota do aluno");
			a.nota[i] = sc.nextDouble();
			a.soma = a.nota[i] + a.soma;
		}
		System.out.println();
		System.out.println("Digite o nome do aluno");
		b.nome = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite A nota do aluno");
			b.nota[i] = sc.nextDouble();
			b.soma = b.nota[i] + b.soma;
		}
		System.out.println();
		a.imprimir();
		a.calculo();
		b.imprimir();
		b.calculo();
	}
}