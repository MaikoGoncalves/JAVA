/*Leia quatro notas, calcule a média aritmética e imprima o resultado*/
package lista1;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			
			int i;
			double num, media = 0, soma=0;

		    for (i=1 ; i < 5 ; i++) {
		    	System.out.println("Entre com a "+ i +"º nota: ");
		    	num=sc.nextDouble();
		    	soma += num;
		    }
			media = soma /4;
			
			System.out.println("Media das quatros notas são: " + media);
	}

}
