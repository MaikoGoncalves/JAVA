package lista1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			
			double real,dolar,valor=0;
			System.out.println("\n Digite o valor em Real: ");
		    real = sc.nextDouble();
		    System.out.println("\n Digite a cotação dólar: ");
		    dolar = sc.nextDouble();
		    
		    valor = real/dolar;
		    
		    System.out.println(" Você tem R$ "+real+ " a que vale USD " + valor+ " \n Você tem "+ valor+ " Dólar");
			
	}

}

/*Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor correspondente em
dólares.*/