package aula;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double[] notas = new double[5];
		double soma=0;
		double media=0;		
		for (int i = 0 ; i < notas.length; i ++)
		{   	
            System.out.println("Entre com a " + (i+1) + "º Nota");
            notas[i] = scan.nextDouble();
	        soma = soma + notas[i];
		}    
		media=soma/5;
		System.out.println("");
		System.out.println("A soma é: " + soma);
		System.out.println("A media é: " + media);
		System.out.println("");
				for (int i = 0 ; i < notas.length; i ++)
		        {	
			       if(notas[i]>=media)
			         {
                      System.out.println("Sua " + (i+1) + "º nota foi "+ notas[i]+ " maior " + media + " media");
                     }

		        }
    	}	
}