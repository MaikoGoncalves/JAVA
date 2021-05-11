package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA= new int[2];
		for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorA na posição "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    }
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.println("Analizando o número "+vetorA[i]); 
			for (int j=1; j<=vetorA[i]; j++)
			{
				if(vetorA[i] % j == 0)
				{
				System.out.println("o numero " + vetorA[i] + " é divisor de " +j);
				}
			}System.out.println();
		}

	}

}
