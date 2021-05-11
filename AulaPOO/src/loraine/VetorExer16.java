package loraine;

import java.util.Locale;
import java.util.Scanner;

public class VetorExer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int[] vetorA = new int[4];
		for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.println("Entre com o valor do VETOR A da posição: " + i);
		  vetorA[i] = scan.nextInt();
		}
        
		System.out.print("Vetor A= ");
	    for (int i = 0 ; i < vetorA.length; i ++)
		{	
		  System.out.print(vetorA[i]+ " ");
		}
	    System.out.println("");
	    int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15=0;		
	    int igual15=0;
	    for (int i = 0 ; i < vetorA.length; i ++) 
	    {
	          if(vetorA[i]==15)
	          {
	           igual15++;
	          } 
	          else if (vetorA[i]<15)
	          {	 
	           somaMenor15 += vetorA[i];	 
	          }
	          else 
	          {
	          qtdMaior15++;
	          somaMaior15 +=vetorA[i];
	          }
	     }
	    System.out.println("Qtd números == 15: "+igual15);
	    System.out.println("Soma números < 15: "+somaMenor15);
	    System.out.println("Média números > 15: "+(somaMaior15/qtdMaior15));
	
	}
}
