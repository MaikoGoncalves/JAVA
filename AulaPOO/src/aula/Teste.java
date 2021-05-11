package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Digite um numero");
		numero = leitor.nextInt();
		
		boolean primo = true;
		
		for(int i = 2 ; i < numero; i++) {
			
			if(numero % i == 0 )
			{
			System.out.println("O numero " + numero +  " não é primo pois divide por  " + i);
			primo = false;
			}
		}
		
		if (primo) 
		    {
			System.out.println( numero + (" não é primo"));
			}
	}

}