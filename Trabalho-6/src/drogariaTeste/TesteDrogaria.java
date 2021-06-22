package drogariaTeste;

import java.util.Scanner;

import drogaria.Produto;

public class TesteDrogaria{

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);
		boolean opc = true, opc1=true, opc2=true;
		int pos=0,aux1=0;
		
		do {
			  System.out.println("***** MENU DE OPÇÃO *****");	
			  System.out.println("* 1-CADASTRAR PRODUTO ***");
			  System.out.println("* 2-MOSTRAR PRODUTO *****");
			  System.out.println("* 3-PRODUTO MAIS CARO ***");
			  System.out.println("* 4-ALTERAR PRODUTO *****");
			  System.out.println("* 5-FINALIZAR PROGRAMA **");
			  System.out.println("*************************");	
			  int opcao = scan.nextInt();
					
		switch (opcao) {
		case 1:{
				if(produto.verificarCod(true , pos)){
				   do {          
					System.out.println("* 1-PRODUTO MEDICAMENTO *");
					System.out.println("* 2-PRODUTO HIGIENE *****");
					int opcao1 = scan.nextInt();
					switch (opcao1) {
					case 1:{
					    System.out.println("Entre com o nome do Item:");
					    produto.setNomeProduto(pos, scan.next());
					    System.out.println("Entre com o preço de custo:");
					    produto.setPrecoCusto(pos, scan.nextDouble());
					    System.out.println("Entre com o percentual de lucro:");
					    produto.setPorc(pos, scan.nextDouble());
					    System.out.println("Entre com a data de vencimento:");
					    produto.setDataVenc(pos, scan.next());
					    
					    pos++;
					    opc1=false;
					    break;
				        }
				    case 2:{
				   	    System.out.println("Entre com o nome do Item:");
				        produto.setNomeProduto(pos, scan.next());
				        System.out.println("Entre com o preço de custo:");
				        produto.setPrecoCusto(pos, scan.nextDouble());
				        produto.setPorc(pos, 30);
				        pos++;
				        opc1=false;
				        break;
				           }  
						}
						}while (opc1==true);
				    }
				 break;
			    }
		case 2:{ 
			    produto.imprimir(pos);
			    break;
		}	
		case 3:{
			int x = produto.precoMaior(pos);
			produto.imprimirMaior(x);				
			break;
	    }
		case 4:{
	        int alt=0;
			System.out.println("Alterar Digite o codigo do produto");
	        aux1= scan.nextInt();
	        alt=aux1-1;
            if(aux1>0 && aux1<=pos) {
            do {          
					System.out.println("* 1-PRODUTO MEDICAMENTO *");
					System.out.println("* 2-PRODUTO HIGIENE *****");
					int opcao2 = scan.nextInt();
					
            	switch (opcao2) {
				case 1:{
				    System.out.println("Entre com o nome do Item:");
				    produto.setNomeProduto(alt, scan.next());
				    System.out.println("Entre com o preço de custo:");
				    produto.setPrecoCusto(alt, scan.nextDouble());
				    System.out.println("Entre com o percentual de lucro:");
				    produto.setPorc(alt, scan.nextDouble());
				    System.out.println("Entre com a data de vencimento:");
				    produto.setDataVenc(alt, scan.next());
				    
				    opc2=false;
				    break;
			        }
			    case 2:{
			   	    System.out.println("Entre com o nome do Item:");
			        produto.setNomeProduto(alt, scan.next());
			        System.out.println("Entre com o preço de custo:");
			        produto.setPrecoCusto(alt, scan.nextDouble());
			        produto.setPorc(alt, 30);
			        opc2=false;
			        break;
			           }  
					}
					}while (opc2==true);
			           	
            }else {
            	System.out.println("Produto inexistente");
            }
			    break;
			    }
		
		case 5:{
			opc=false;
		    break;
		 }
	
		}
			}while (opc==true);

	}

}