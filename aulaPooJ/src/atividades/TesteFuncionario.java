package atividades;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do funcionario");
		func.nome = sc.nextLine();
		System.out.println("Entre com o Salario Bruto");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Entre com a taxa de imposto");
		func.taxa = sc.nextDouble();
		
		func.calcularNovoSalario();
				
		System.out.println("O Nome do funcion�rio �: " + func.nome);
		System.out.println("O Sal�rio Bruto �: " + func.salarioBruto);
		System.out.println("O Sal�rio L�quido �: " + func.calcularNovoSalario());
	
		System.out.println("\nEntre com a % do aumento");
		double porc = sc.nextDouble();
		
		System.out.println("O Nome do funcion�rio �: " + func.nome);
		System.out.println("O Sal�rio Bruto �: " + func.salarioBruto);
		System.out.println("O Novo Sal�rio �: " + func.calcularAumentoSalario(porc));
	}
}
