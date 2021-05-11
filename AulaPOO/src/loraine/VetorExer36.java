package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double[] vetorA= new double[4];
		for (int i=0; i<vetorA.length;i++)
	    {
            vetorA[i] = Math.pow(2, i);
		}
		System.out.println();
		System.out.print("Vetor A = ");	
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.print("["+ vetorA[i] + "]");	
		}		
	}
}
