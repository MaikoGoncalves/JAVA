package lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		int x=0,x1=0,x2=0;
		System.out.println("\n Digite um numero inteiro");
	    x = sc.nextInt();
	    
	    x1 = (x-1)*2;
	    x2 = (x+1)*3;
	    
	    System.out.println(" O numero digitado foi: " + x);
	    System.out.println(" Valor do dobro do seu antecessor: " + x1);
	    System.out.println(" Valor do triplo do seu sucessor: " + x2);
  }
}

/*Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de
seu dobro.*/