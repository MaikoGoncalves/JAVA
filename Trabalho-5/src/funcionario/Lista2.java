package funcionario;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		int[]     idade  = new int[5];
		double[]  altura = new double[idade.length];
		double[]  peso   = new double[idade.length];
		int qtdIdade = 0,qtdAltura=0;
		double qtdPeso=0;
		double totalAltura=0;
		Scanner scan = new Scanner(System.in);		
		for(int i = 0 ; i< idade.length; i++) {
			System.out.println("Entre com a idade ");
		    idade[i] = scan.nextInt();
		if(idade[i]>=50) {
		   qtdIdade++;
		 }
		    System.out.println(" Entre com a altura ");
		    altura[i] = scan.nextDouble();
		if(idade[i]>=10 & idade[i]<=20) {
		    totalAltura=altura[i]+totalAltura;
		    qtdAltura++;
		    }
	 	 System.out.println(" Entre com o peso ");
		 peso[i] = scan.nextDouble();
		 if (peso[i]<=40) {
         qtdPeso++;		 
		}
	}
double porc =  ((qtdPeso*100)/5);	
		
System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+qtdIdade);
System.out.println("A Média das alturas das pessoas com idade entre 10 e 20 anos: "+totalAltura/qtdAltura);
System.out.println("A porcentagem de pessoas com peso inferior a 40 Kg:  " + porc +"%");
	
	}
}


