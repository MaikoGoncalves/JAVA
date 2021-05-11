package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		int[] vetorA= new int[5];
		char[] vetorB= new char[vetorA.length];
		int[] vetorC= new int[vetorA.length];
		for (int i=0; i<vetorA.length;i++)
	    {	
			System.out.println("Entre com um número para a posição "+ i);
	        vetorA[i]=scan.nextInt();
	        if(vetorA[i]<7)
	        { 
	        	vetorB[i] = 'a';
	        	vetorC[i] = 'a';
	        }else if(vetorA[i]==7)
	            {
	        	   vetorB[i] = 'b';
	        	   vetorC[i] = 'b';
	            }else if((vetorA[i]>7)&&(vetorA[i]<10))
	                {
	            	vetorB[i] = 'c';
	            	vetorC[i] = 'c';
	                }else if(vetorA[i]==10)
		               {
	 	        	   vetorB[i] = 'd';
	 	        	   vetorC[i] = 'd';
		               }else 
		                   { vetorB[i] = 'e';
		                     vetorC[i] = 'e';
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