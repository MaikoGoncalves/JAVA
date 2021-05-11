package lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);	
			
			int x=0,x1=0,x2=0;
			System.out.println("\n Digite um numero inteiro");
		    x = sc.nextInt();
		    
		    x1 = x-1;
		    x2 = x+1;
		    
		    System.out.println(" O numero digitado foi: " + x);
		    System.out.println(" O seu antecessor: " + x1);
		    System.out.println(" O seu sucessor: " + x2);
	}

}
