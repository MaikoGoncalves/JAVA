package lista1;

import java.util.Scanner;

public class Exercicio13 {

            public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);	
				
				double lt,m;
				System.out.println("\n Digite um valor em litros ");
			    lt = sc.nextDouble();
			    
			    m = lt/1000;
			    
			    System.out.println(" Metros cúbicos " + m + " m3"); 
	}

}
/*Leia um valor de volume em litros e apresente-o convertido em metros cúbicos m3
. A
fórmula de conversão é: M = L/1000, sendo L o volume em litros e M o volume em metros
cúbicos.*/