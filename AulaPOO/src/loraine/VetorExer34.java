package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA= new int[2];
		for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um n�mero para o VetorA na posi��o "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    }
		for (int i=0; i<vetorA.length;i++)
		{
			System.out.println("Analizando o n�mero "+vetorA[i]); 
			for (int j=2; j<vetorA[i]; j++)
			{
				if(j % 2 == 0)
				{
				System.out.println("o numero " + j + " � par");
				}
			}System.out.println();
		}
	}
}