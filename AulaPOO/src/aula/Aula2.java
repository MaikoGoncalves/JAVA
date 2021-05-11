package aula;
import java.util.Scanner;
public class Aula2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);		
		 double d=3.14;
		 int x,y;
	     int i = (int) d; 
	
    System.out.println(" O numero D: " + d);
    System.out.println(" O numero I: " + i);
	
    
    System.out.println("\n Digite um numero inteiro");
    x = sc.nextInt();
    System.out.println("\n Digite um numero inteiro");
    y = sc.nextInt();
    
    if(x >= y) {
    	System.out.println(" O numero maior: " + x);
    }
    else {
    	System.out.println(" O numero maior: " + y);
	}
  }
}
