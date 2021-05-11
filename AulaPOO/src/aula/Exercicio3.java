/*1. Criar um vetor (Array) chamado A com 10 números inteiros, formular um
algoritmo que determine o maior elemento deste array.*/
package aula;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[10];
		int maior=0,teste=0;    
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
          teste=vetorA[i];
		  if(teste>maior) 
		  { 	
		  maior=vetorA[i]; 
		 // maior = maior >= a[i] ? maior: a[i];
		  }  
		}
		System.out.print("O nuemro maior e: " + maior);
	}
}
