package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA= new int[2];
		int[] vetorB= new int[vetorA.length];

		for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorA na posição "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    }
		 
		for (int i=0; i<vetorA.length;i++) 
		{
		  vetorB[i] = 1;
		  for (int j = 1 ; j<=vetorA[i]; j++)
		  {
			vetorB[i] *= j;  
		  }
		}System.out.println();
			for (int i=0; i<vetorA.length;i++)
			{
				System.out.println("Fatorial de "+ vetorA[i] + " é "+vetorB[i]);	
			}
		}
}