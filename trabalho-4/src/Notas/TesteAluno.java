package Notas;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		double soma=0,soma1=0;
		
		System.out.println("Digite o nome do aluno");
		a.nome = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite A nota do aluno");
			a.nota[i] = sc.nextDouble();
			soma = a.nota[i] + soma;
		}
		System.out.println();
		System.out.println("Digite o nome do aluno");
		b.nome = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite A nota do aluno");
			b.nota[i] = sc.nextDouble();
			soma1 = b.nota[i] + soma1;
		}
		System.out.println();
		a.imprimir(soma);
		a.calculo(soma);
		b.imprimir(soma1);
		b.calculo(soma1);
	}
}