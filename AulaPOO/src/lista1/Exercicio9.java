package lista1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			
			double real,dolar,valor=0;
			System.out.println("\n Digite o valor em Real: ");
		    real = sc.nextDouble();
		    System.out.println("\n Digite a cota��o d�lar: ");
		    dolar = sc.nextDouble();
		    
		    valor = real/dolar;
		    
		    System.out.println(" Voc� tem R$ "+real+ " a que vale USD " + valor+ " \n Voc� tem "+ valor+ " D�lar");
			
	}

}

/*Leia um valor em real e a cota��o do d�lar. Em seguida, imprima o valor correspondente em
d�lares.*/