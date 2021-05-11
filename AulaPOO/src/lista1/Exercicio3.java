package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			
			int x,y,w;
			double media;
			System.out.println("\n Digite um numero inteiro");
		    x = sc.nextInt();
		    System.out.println("\n Digite um numero inteiro");
		    y = sc.nextInt();
		    System.out.println("\n Digite um numero inteiro");
		    w = sc.nextInt();
		    
		    media = (x+y+w)/3;
		    
		    System.out.println(" Numeros digitados "+ x +" ,"+ y +" ,"+ w +  "\n A sua media é: " + media);
		
   }

}
