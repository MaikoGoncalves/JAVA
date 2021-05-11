package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA= new int[6];
		int[] vetorB= new int[vetorA.length];
		int pos=0;
		for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorA na posição "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    	if(vetorA[i] % 2 == 0) 
	    	{
				vetorB[pos] = vetorA[i];
				pos++;
	    	}
	    }
		for (int i=0; i<vetorA.length;i++)
	    {
			if(vetorA[i] % 2 != 0) 
	    	{
				vetorB[pos] = vetorA[i];
				pos++;
	    	}
	    }
		System.out.println();
		System.out.print("Vetor A = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorA[i] + "]");	
		}
	    System.out.println();
	    System.out.print("Vetor B = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorB[i] + "]");	
		}		
		
		
		
	}

}
