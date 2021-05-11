package loraine;
import java.util.Locale;
import java.util.Scanner;
public class VetorExer18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		int[] idade = new int[5];
		int qtd=0;
		for (int i = 0 ; i < idade.length; i ++)
		{	
		  System.out.println("Entre com a idade da pessoa " + (i+1));
		  idade[i] = scan.nextInt();
		}  
		System.out.println("\n**IDADES**");
		for (int i = 0 ; i < idade.length; i ++)
		{	
		 System.out.print(idade[i]+" ");
		}  
		int menor = idade[0];
		int indexMenor=0;
		int maior = idade[0];
		int indexMaior = 0;
		for (int i = 1 ; i < idade.length; i ++)
		{	
			if(idade[i]>maior)
			{	
				maior = idade[i];
				indexMaior = i;
			}else if (idade[i]<menor)
			{
				menor = idade[i];
				indexMenor = i;
			}
		}  
		System.out.println();
		System.out.println("Menor idade: " + menor); 
		System.out.println("Índice menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maior); 
		System.out.println("Índice menor idade: " + indexMaior);
	}

}
