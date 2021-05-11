package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer32 {
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
		{   System.out.println("\n** TABUADA DE "+vetorA[i]+" **");   
			for (int j=0; j<=10; j++)
		       {	
			   System.out.println(vetorA[i]+" x "+j+" = "+vetorA[i]*j);		
		       }
		}
	}
}