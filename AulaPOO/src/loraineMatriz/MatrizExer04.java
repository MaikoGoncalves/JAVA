package loraineMatriz;

import java.util.Scanner;

public class MatrizExer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao;
				
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite o para sair.");
			opcao = scan.nextByte();

			if (opcao == 1) {// adicionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre como o dia do m�s.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}
				boolean horaValida = false;
		        int hora = 0;
				while (!horaValida) {
					System.out.println("Entre como a hora do compromisso.");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido, digite novamente");
					}
				}
				dia--;// pelo motivos dos dias
				System.out.println("Digite o compromisso");
				compromissos[dia][hora] = scan.next();

			} else if (opcao == 2) {// verificar compromisso


				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre como o dia do m�s.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}
				boolean horaValida = false;
		        int hora = 0;
				while (!horaValida) {
					System.out.println("Entre como a hora do compromisso.");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido, digite novamente");
					}
				}
				dia--;						
				
				System.out.println("O compromisso agendado");
				System.out.println(compromissos[dia][hora]);
				
				
			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente");
			}
		}
	}
}