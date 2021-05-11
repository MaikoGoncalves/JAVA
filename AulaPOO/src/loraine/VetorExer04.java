package loraine;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[3];
		double[] vetorB = new double[vetorA.length];    
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
	      vetorB[i] = Math.sqrt(vetorA[i]);	
		}
		System.out.print("\nVetor A = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		{ 
		System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.print("Vetor B = ");
		for (int i = 0 ; i < vetorA.length ; i ++) 
		       { 
			  	System.out.print(df.format(vetorB[i]) + " ");
			   }
       }
}
