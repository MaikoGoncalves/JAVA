package lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);	
		
		double ld,a,p;
		System.out.println("\n Digite um lado do quadrado em cm");
	    ld = sc.nextDouble();
	    
	    a = Math.pow(ld, 2);
	    p = ld*4;
	    
	    System.out.println(" A �rea do quadrado �: " + a+ "cm");
	    System.out.println(" O Per�metro do quadrado �: " + p+ "cm");     
	}

}
/*Leia o tamanho do lado de um quadrado e imprima como resultado a sua �rea e per�metro.*/