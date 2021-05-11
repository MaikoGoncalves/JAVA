package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		double[] vetorA= new double[5];
		double cota;
		System.out.print("Entre com a cotação do dólar: ");
		cota = scan.nextDouble();
	    for (int i=0; i<vetorA.length;i++)
	    {	
		  vetorA[i] = cota * (i+1);
	    }
		System.out.print("A cotação: "+ cota);
		System.out.println();
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println(vetorA[i] + " ");
		}
	}
}