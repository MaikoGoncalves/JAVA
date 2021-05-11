package loraineMatriz;

import java.util.Scanner;

public class MatrizExer05 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[][][] compromissos = new String[12][31][24];
			
			boolean sair = false;
			int opcao;
					
			while (!sair) {
				System.out.println("***************************************");
				System.out.println("* Digite 1 para adicionar compromisso.*");
				System.out.println("* Digite 2 para verificar compromisso.*");
				System.out.println("* Digite o para sair.******************");
				System.out.println("***************************************");
				opcao = scan.nextByte();

				if (opcao == 1) {// adicionar compromisso

					boolean mesValido = false;
					int mes = 0;
					while (!mesValido) {
						System.out.println("Entre como o mês.");
						mes = scan.nextInt();
						if (mes > 0 && mes <= 12) {
							mesValido = true;
						} else {
							System.out.println("Mês inválido, digite novamente");
						}
					}
														
					boolean diaValido = false;
					int dia = 0;
					while (!diaValido) {
						System.out.println("Entre como o dia do mês.");
						dia = scan.nextInt();
						if (dia > 0 && dia <= 31) {
							diaValido = true;
						} else {
							System.out.println("Dia inválido, digite novamente");
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
							System.out.println("Hora inválido, digite novamente");
						}
					}
					mes--;// mes 12
					dia--;// pelo motivos dos dias
					System.out.println("Digite o compromisso");
					compromissos[mes][dia][hora] = scan.next();
					System.out.println();
					

				} else if (opcao == 2) {// verificar compromisso

					boolean mesValido = false;
					int mes = 0;
					while (!mesValido) {
						System.out.println("Entre como o dia do mês.");
						mes = scan.nextInt();
						if (mes > 0 && mes <= 12) {
							mesValido = true;
						} else {
							System.out.println("Mês inválido, digite novamente");
						}
					}
											
					boolean diaValido = false;
					int dia = 0;
					while (!diaValido) {
						System.out.println("Entre como o dia do mês.");
						dia = scan.nextInt();
						if (dia > 0 && dia <= 31) {
							diaValido = true;
						} else {
							System.out.println("Dia inválido, digite novamente");
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
							System.out.println("Hora inválido, digite novamente");
						}
					}
					mes--;
					dia--;						
					
					System.out.println("O compromisso agendado");
					System.out.println(compromissos[mes][dia][hora]);
					System.out.println();
					
				} else if (opcao == 0) {// sair
					sair = true;
				} else {
					System.out.println("Opção inválida, digite novamente");
				}
			}
		}
	
	}


