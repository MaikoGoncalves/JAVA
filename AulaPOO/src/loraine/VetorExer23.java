package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer23 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Locale.setDefault(Locale.US);	
			int[] vetorA= new int[5];
			for (int i=0; i<vetorA.length;i++)
		    {	
				System.out.println("Entre com um número para a posição "+ i);
		        vetorA[i]=scan.nextInt();
		          if(vetorA[i] % 2 != 0 )
		          { 
		           System.out.print("Digitou um numero impar");	  
		           break;
		          }
		    }
	
			/*for (int i=0; i<vetorA.length;i++)
			{
				System.out.print("["+ vetorA[i] + "]");	
			}
		*/
	}
}