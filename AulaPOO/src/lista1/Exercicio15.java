package lista1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);	
		
		double g,r;
		System.out.println("\n Informe o Radiano ");
	    r = sc.nextDouble();
	    
	    g = r*(180/Math.PI); 
	    
	    
	    System.out.println(" Em ângulo " + g); 
		
	}

}
