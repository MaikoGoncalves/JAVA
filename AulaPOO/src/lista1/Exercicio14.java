package lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		double g,r;
		System.out.println("\n Informe o Angulo em Graus ");
	    g = sc.nextDouble();
	    
	    r = g*(Math.PI/180); 
	    
	    
	    System.out.println(" Em Radianos " + r); 
		
		
		
	}

}
/*Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula de conversão
é: R = G ∗ π/180, sendo G o ângulo em graus e R em radianos e π = 3.14.*/