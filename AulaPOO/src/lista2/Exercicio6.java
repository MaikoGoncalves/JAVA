package lista2;

public class Exercicio6 {

	public static void main(String[] args) {
		 			
			System.out.println("Fatorial de 0 at� 10");
			System.out.println("\nFatorial de 0 � 1");
			
			int fatorial=1 , y=0 ;
			int soma=1;
			for (int i=1; i<=10; i++) {
				soma=fatorial * soma;
				
				System.out.println("O fatorial de "+ i + " �: ("+ (y) +"!) * " + fatorial + " = " + soma);
			    y++;
				fatorial++;
			}

	}
	}

