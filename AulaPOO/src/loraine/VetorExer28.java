package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		int[] vetorA= new int[5];
		int[] vetorB= new int[vetorA.length];
		for (int i=0; i<vetorA.length;i++)
	    {	
			System.out.print("Entre com um número para a posição "+ i+ " = ");
	        vetorA[i]=scan.nextInt();
	        vetorB[vetorA.length - i - 1] = vetorA[i];
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
