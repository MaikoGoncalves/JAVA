package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		int[] vetorA= new int[5];
		int[] vetorB= new int[vetorA.length];
		int[] vetorC= new int[vetorA.length];
		for (int i=0; i<vetorA.length;i++)
	    {	
			System.out.println("Entre com um número para a posição "+ i);
	        vetorA[i]=scan.nextInt();
	    }
		for (int i=0; i<vetorB.length;i++)
	    {	
			System.out.println("Entre com um número para a posição "+ i);
	        vetorB[i]=scan.nextInt();
	    }
		for (int i=0; i<vetorB.length;i++)
	    {	if(vetorA[i] > vetorB[i])
	        {
	    	vetorC[i]=1;
	        }
	        else if(vetorA[i] == vetorB[i])
	        {
	        	vetorC[i]=0; 	
	        }
	        else {
            vetorC[i]=-1;	        	
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
	    System.out.println();
	    System.out.print("Vetor C = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorC[i] + "]");	
		}
	
	}

}
