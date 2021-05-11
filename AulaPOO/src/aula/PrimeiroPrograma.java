package aula;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		//LEITURA DE TECLADO
		Scanner sc=new Scanner(System.in);	
		
		int num1 = 10;
		int num2 = 30;
		int a,b,soma,idade;
		String nome;
		double altura;
		
		System.out.println(" Olá mundo!!!");
	    System.out.print(" Maiko");
	    System.out.print(" Soares");
	    System.out.printf("\n Soma das variáveis num1 e num2 = %d", (num1+num2));
	    
	    System.out.println("\n Digite seu nome");
	    nome = sc.nextLine();
	    System.out.println("Digite sua idade");
	    idade = sc.nextInt();
	    System.out.println("Digite seu altur");
	    altura = sc.nextDouble();
	    
	      
	    System.out.println("Nome:" + nome);
	    System.out.println("Idade:" + idade);
	    System.out.println("Altura:" + altura);
	    
	        
	}
}
