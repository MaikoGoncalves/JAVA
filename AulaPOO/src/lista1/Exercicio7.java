/*Fa�a a leitura de tr�s valores e apresente como resultado a soma dos quadrados dos tr�s valores
lidos.*/
package lista1;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			
			double x,x1,y,y1,w,w1,soma;
			System.out.println("\n Digite um numero");
		    x = sc.nextDouble();
		    System.out.println("\n Digite um numero");
		    y = sc.nextDouble();
		    System.out.println("\n Digite um numero");
		    w = sc.nextDouble();
		    
		    x1 = Math.pow(x, 2);
		    y1 = Math.pow(y, 2);
		    w1 = Math.pow(w, 2);
		    soma = x1+y1+w1;
		    System.out.println(" O quadrado do 1� numero �: " + x1);
		    System.out.println(" O quadrado do 2� numero �: " + y1);
		    System.out.println(" O quadrado do 3� numero �: " + w1);
			  
		    System.out.println(" A soma dos quadrados dos tr�s numeros �: " + soma);
	}

}
