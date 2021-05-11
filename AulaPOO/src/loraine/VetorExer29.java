package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		int[] vetorA= new int[3];
		int[] vetorB= new int[vetorA.length];
		int[] vetorC= new int[vetorA.length*2];
        
	    for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorA na posição "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    	vetorC[i]=vetorA[i];
	    }
	   for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorB na posição "+ i+ " = ");
	    	vetorB[i]=scan.nextInt();
	    	vetorC[vetorA.length + i]=vetorB[i];
	    }       
	    System.out.println();
		System.out.print("Vetor A = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorA[i] + "]");	
		}
	    System.out.println();
	    System.out.print("Vetor B = ");	
		for (int i=0; i<vetorB.length;i++)
		{
			System.out.print("["+ vetorB[i] + "]");	
		}		
		System.out.println();
	    System.out.print("Vetor C = ");	
		for (int i=0; i<vetorC.length;i++)
		{
			System.out.print("["+ vetorC[i] + "]");	
		}		
	
	
	
	}

}
