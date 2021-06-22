package funcionario;

import java.util.Scanner;

public class TesteFuncionario {

  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  Funcionario func = new Funcionario();
	  boolean opc = true;
	  
	  System.out.println("Entre com o Salario Bruto");
	  func.salarioBruto = scan.nextDouble();
	 
	  do {
	  System.out.println("***** MENU DE OPÇÃO ****");	
	  System.out.println("* 1-Imposto            *");
	  System.out.println("* 2-Novo Salario       *");
	  System.out.println("* 3-Classificação      *");
	  System.out.println("* 4-Finalizar Programa *");
	  System.out.println("************************");	
	  int opcao = scan.nextInt();
	
		
	
	switch (opcao) {
	case 1:{
	     func.calcularImposto();
		 System.out.println("O Salario Bruto: R$" + func.salarioBruto);
		 System.out.println("Porcentagem do Imposto " + func.imposto + "%");
		 System.out.println("Valor do Imposto: R$" + func.vImposto);
		 System.out.println("O Salario liquido: R$" + func.salarioNovo);			
		 System.out.println(); 
		 break;
	     }
	case 2:{ 
		 func.novoSalario();
		 func.calcularImposto();
		 System.out.println("O Salario Bruto: R$" + func.salarioBruto);
		 System.out.println("Porcentagem do Imposto " + func.imposto + "%");
		 System.out.println("Valor do Imposto: R$" + func.vImposto);
		 System.out.println("O Salario liquido: R$" + func.salarioNovo);
		 System.out.println("Teve um aumento de R$"+ func.vAumento +" no Salario Bruto");
		 System.out.println();
		 break;
	     }	
	case 3:{
		if(func.salarioBruto<700) {
			System.out.println("Mal Remunerado");
		}else {
			System.out.println("Bem Remunerado");
		}
	    break;
	    }
	   
	case 4:{
		opc=false;
	    break;
	    }
	}
	}while (opc==true);
  }
}
