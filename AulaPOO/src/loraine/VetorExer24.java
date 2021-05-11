package loraine;

import java.util.Locale;
import java.util.Scanner;
public class VetorExer24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		int[] vetorA= new int[5];
		for (int i=0; i<vetorA.length;i++)
	    {	
			System.out.println("Entre com um número para a posição "+ i);
	        vetorA[i]=scan.nextInt();
	    }
		boolean palindromo = true;
		for (int i=0; i<vetorA.length;i++) 
		{
	         if(vetorA[i] != vetorA[vetorA.length -1 -i])
	         {
	        	 palindromo = false;
	        	 break;
	         }
		}
		System.out.print("Vetor A = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorA[i] + "]");	
		}
	    System.out.println();
	    
	    if(palindromo)
	    {
	    	System.out.println("Palindromo");
	    }else{ 
	    	System.out.println("Não é palindromo");
	    }
	}
}