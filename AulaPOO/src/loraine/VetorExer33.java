package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA= new int[4];
		for (int i=0; i<vetorA.length;i++)
	    {
	    	System.out.print("Entre com um número para o VetorA na posição "+ i+ " = ");
	    	vetorA[i]=scan.nextInt();
	    }
		boolean primo;
		String msg;
		
		for (int i=0; i<vetorA.length;i++)
		{   
		    primo = true;
			for (int j=2; j<vetorA[i]; j++)
			{
				if (vetorA[i] % j == 0)
				{ primo = false;
				  break;
				}  
			}
    	   msg = "";
		   if(primo) 
    	   {
    		msg="E Primo";
    	   }else {
    		msg="Não Primo";
    	   }		
			System.out.println("O numero: " + vetorA[i] + " " + msg);
		}
   }
}
