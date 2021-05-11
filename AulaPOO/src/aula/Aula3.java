// aula de vetor
// double[] temperaturas = new double[5];
//  temperaturas[0] = 35.3;
//  temperaturas[1] = 23;
// int[] vetorA = new int[7];

package aula;

import java.util.Locale;
import java.util.Scanner;
public class Aula3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];// length e tamanho
		
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
	}
            System.out.print("Vetor A = ");
        for (int i = 0 ; i < vetorA.length; i ++) 
        { 
        	System.out.print(vetorA[i] + " ");
        }
	
	System.out.println();
	
	System.out.print("Vetor B = ");
    for (int i = 0 ; i < vetorB.length; i ++) 
    { 
    	System.out.print(vetorB[i] + " ");
    }

	
	}
}
