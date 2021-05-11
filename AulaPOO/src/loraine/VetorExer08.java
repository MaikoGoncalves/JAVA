package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];   
        int[] vetorC = new int[vetorA.length];
        
        
        for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();	
		}
        System.out.println();
        for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR B da posição: " + i);
		  vetorB[i] = scan.nextInt();
		}
        for (int i = 0 ; i < vetorA.length; i ++)
		{	
		 vetorC[i] = vetorA[i] * vetorB[i];
		}
        
        System.out.print("\nVetor A = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorC[i] + " ");
		}
 	}

}

