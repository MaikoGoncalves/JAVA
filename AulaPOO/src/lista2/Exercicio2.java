package lista2;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean entrar = true;
		
		System.out.println("Entre com um número: ");
		int n =sc.nextInt();
        
		if(n<=1)
		{
			System.out.println("testes Não é primo e divisivel por ");
		
        }
		if(entrar) {
		boolean primo = true;
		
		for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
			System.out.println("Não é primo e divisivel por " + i);
			primo = false;
	        } 	
	}
	if (primo) {
		System.out.println("É primo: " + n);
	}
    
 }
	}
}
