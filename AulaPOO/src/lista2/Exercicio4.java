package lista2;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		int soma=0,y=0;
		for (int i = 1; i <= 1000 ; i++) {
			y=soma;
			soma = soma + i;
			System.out.println(" " + y + " + " + i + " = "+ soma );
			
			}

		System.out.println(" A soma de 1 até 1.000 é: " + soma);
	}

}
