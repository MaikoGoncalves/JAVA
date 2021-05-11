package aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];    
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
	    }
		
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR B da posição: " + i);
		  vetorB[i] = scan.nextInt();
	      vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("\nVetor A = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
			   System.out.print("[");  	
			   System.out.print(vetorA[i] + "");
			   System.out.print("]");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		       { 
			   System.out.print("[");  	
			   System.out.print(vetorB[i] + "");
			   System.out.print("]");
		       }
		
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		       { 
			   System.out.print("[");  	
			   System.out.print(vetorC[i] + "");
			   System.out.print("]"); 
		       }

	
	}
}



