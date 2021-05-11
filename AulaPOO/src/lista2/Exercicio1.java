package lista2;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double soma = 0 , media=0;
		
		for(int i = 1; i<6 ; i++) {
			System.out.println("Digite a "+ i + "º nota do Aluno no maximo 20 pontos");
			double nota = sc.nextDouble();	
			soma += nota;
		}
		    media = soma / 5 ;
		    if (soma < 50) 
			{
				System.out.println("!!! Reprovado !!! Nota: " + soma);
			} 
			else if (soma >= 50 && soma <70) 
			{
				  System.out.println("!! Prova Final !! nota: " + soma);  
	        }else 
	            {
	        	System.out.println("!!! Aprovado !!! Nota: " + soma);
	        	}
			    System.out.println("!! Sua Media !! Foi de: " + media);
		}
	}
