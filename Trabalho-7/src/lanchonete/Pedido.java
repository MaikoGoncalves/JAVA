package lanchonete;

import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);

		boolean opc = true;
		boolean naoTerminar1 = true;
		int cod = 0, qtd = 0;

		do {
			System.out.println("***********************************");
			System.out.println("*** OPÇÕES DA LANCHONETE **********");
			System.out.println("*** 1-INICIAR O PEDIDO ************");
			System.out.println("*** 2-APRESENTAR TOTAL DE PEDIDOS *");
			System.out.println("*** 3-FINALIZAR PROGRAMA **********");
			System.out.println("***********************************");
			int opcao = scan.nextInt();
			switch (opcao) {

			case 1: {
				System.out.println("**********************Cardápio************************");
				System.out.println("***Descrição-------------Código----------Preço *******");
				System.out.println("***Cachorro Quente-------001-------------R$: 10,00****");
				System.out.println("***X-Tudo----------------002-------------R$: 17,00****");
				System.out.println("***Bauru Com Ovo---------003-------------R$: 15,00****");
				System.out.println("***Hamburguer------------004-------------R$: 15,00****");
				System.out.println("***Cheeseburguer---------005-------------R$: 17,00****");
				System.out.println("***Suco------------------006-------------R$:  5,00****");
				System.out.println("***Refrigerante----------007-------------R$:  4,00****");
				System.out.println("******************************************************");

				do {
					naoTerminar1 = true;
					System.out.println("\nDigite um código ou Digite 0 para sair. \n");
					cod = scan.nextInt();
					if (cod == 0 || cod > 7) {
						naoTerminar1 = false;
					} else {
						System.out.println("Digite a quantidade \n");
						qtd = scan.nextInt();
						produto.setFazerPedido(cod, qtd);
						}
				} while (naoTerminar1);
				break;
			}
			case 2: {
				produto.setImprimir();
				break;
			}
			case 3: {
				opc = false;
				break;
			}
			}
		} while (opc == true);
	}
}