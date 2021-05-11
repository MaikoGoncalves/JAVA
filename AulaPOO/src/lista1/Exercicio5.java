package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    
		double x,parte;
		System.out.println("\n Digite um numero");
	    x = sc.nextDouble();
	    
	     parte= x/5;
	    
	    System.out.println("A quinta parte do numero " + x + " é: " + parte);


	}

}
