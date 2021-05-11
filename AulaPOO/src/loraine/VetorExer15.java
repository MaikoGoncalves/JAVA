package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer15 {
	
	    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];   
        int soma=0,impar=0,par=0;     
        
        for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
		  soma += vetorA[i];
		  if(vetorA[i] % 2 ==0) {
			 par++;
		  }
		
		}
        System.out.print("Vetor A = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorA[i] + " ");
		}
		impar=vetorA.length-par;
		System.out.println();
		System.out.print(" Soma dos vetores " + soma);
		System.out.print("\n Numeros impar " + impar);
		System.out.print("\n Numeros par " + par);
		
		double porPar = (par*100)/vetorA.length;
		double porImpar = 100 - porPar; 
		System.out.print("\n Numeros impar " + porImpar);
		System.out.print("\n Numeros par " + porPar);
	}
}
