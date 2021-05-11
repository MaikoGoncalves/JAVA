package aula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);	
		
		int x,y,w,soma;
		double media;
		
	    System.out.println("\n Digite um numero");
	    x = sc.nextInt();
	    System.out.println("Digite um numero");
	    y = sc.nextInt();
	    System.out.println("Digite um numero");
	    w = sc.nextInt();
	    soma = x+y+w;
	    media = soma / 3;
	      
	    System.out.println("Soma: " + soma);
	    System.out.println("Media: " + media);
	    
	}

}
