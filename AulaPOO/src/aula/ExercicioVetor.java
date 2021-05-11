package aula;
import java.util.Locale;
import java.util.Scanner;
public class ExercicioVetor {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			int[] vetorA = new int[5];
			int[] vetorB = new int[5];    
			int[] vetorC = new int[5];
			for (int i = 0 ; i < 5; i ++)
			{	
	            System.out.println("Entre com o valor do VETOR A da posição: " + i);
	            vetorA[i] = scan.nextInt();
	        }
			for (int i = 0 ; i < 5; i ++)
			{	
	            System.out.println("Entre com o valor do VETOR B da posição: " + i);
	            vetorB[i] = scan.nextInt();
	        }
			for (int i = 0 ; i < 5; i ++)
			{	
	         vetorC[i] = vetorA[i] + vetorB[i];
	        }
			   System.out.print("\n Vetor A = ");
	        for (int i = 0 ; i < 5 ; i ++) 
	        { 
	        	System.out.print(vetorA[i] + " ");
	        }
		    System.out.println();
			System.out.print("Vetor B = ");
	        for (int i = 0 ; i < 5 ; i ++) 
	        { 
	    	System.out.print(vetorB[i] + " ");
	        }
            System.out.println();
			System.out.print("Vetor C = ");
	        for (int i = 0 ; i < 5; i ++) 
	        { 
	    	System.out.print(vetorC[i] + " ");
	        }
		}
	}