/*Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A
fórmula de conversão é: F = C*(9.0=5.0) + 32.0, sendo F a temperatura em Fahrenheit e C a
temperatura em Celsius.
*/
package lista1;

import java.util.Scanner;

public class Exercicio6 {

    	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	
		    
			double f,c;
			System.out.println("\n Digite a temperatura em Celsius");
		    c = sc.nextDouble();
		    
		    f = ((c*(1.8)) + 32);
		    
		    System.out.println("A temperatura em Fahrenheit é: " + f);


	}

}
