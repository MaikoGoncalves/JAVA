package aula;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double[] temp = new double[7];
		String dias[]= {"domingo","segunda","terça","quarta","quinta","sexta","sabado"};
		//String[] dias = new String[7];
	  /*dias[0] = "domingo";
		dias[1] = "segunda";
		dias[2] = "terça";
		dias[3] = "quarta";
		dias[4] = "quinta";
		dias[5] = "sexta";
		dias[6] = "sabado";
		*/
		for (int i = 0 ; i < temp.length; i ++)
		{	
		  System.out.println("Digite a temperatura " + dias[i] + " ");
		  temp[i] = scan.nextInt();
	    }
		System.out.print("\nVetor A = ");
		for (int i = 0 ; i < temp.length ; i ++) 
		{ 
		System.out.print("A temperatura de " + dias[i]+ " é: " + temp[i] + "°\n");
		}
    }		
}


