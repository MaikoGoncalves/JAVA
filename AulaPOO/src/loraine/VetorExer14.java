package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer14 {
	    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];   
        int soma=0,impar=0;     
        
        for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
		  
		  if(vetorA[i] % 2 !=0) {
			  soma += vetorA[i];
			  impar++;
		  }
		
		}
        System.out.print("Vetor A = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Soma dos vetores " + soma);
		System.out.print("\nMedia " + soma/impar);
	}

}
