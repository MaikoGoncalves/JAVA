package loraine;

import java.util.Locale;
import java.util.Scanner;
public class VetorExer17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		int[] vetorA = new int[10];
		int qtd=0;
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com a idade da pessoa " + (i+1));
		  vetorA[i] = scan.nextInt();
		  if(vetorA[i]>35)
		  {  qtd++;
		  }  
		}
		System.out.println("Qtd de pessoas com idade > 35 são: " + qtd); 

	}

}
