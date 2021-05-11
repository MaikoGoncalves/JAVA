package aula;
import java.util.Locale;
import java.util.Scanner;
public class Matriz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[][] matrizA = new int[2][3];
		int soma=0;
		for (int i = 0 ; i < 2; i ++)
		{	
			for (int j = 0 ; j < 3; j ++)
			{
			System.out.println("Entre com o valor da POS ["+ i +","+ j +"]");
		    matrizA[i][j] = scan.nextInt();
	        }
		}
		for (int i = 0 ; i < 2; i ++)
		{	
			for (int j = 0 ; j < 3; j ++)
			{
			soma = soma + matrizA[i][j];
		    }
		}
			System.out.println("A soma é: "+soma);
	}
}
