package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class GetSet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println(" Entre com os dados do produto");
		System.out.print(" Nome: ");
		p.nome = scan.next();
		System.out.print(" Pre�o: ");
		p.preco = scan.nextDouble();
		System.out.print(" Quantidade: ");
		p.quantidade = scan.nextInt();

        // Mostrar a primeira parte:
		System.out.println("Nome: " + p.nome + "," + "Pre�o:R$ " 
        + p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
        + "Total:R$ "+p.valorTotalEstoque());
	   
		//Fazendo adi��o de Produtos:
		System.out.println("Digite a quantidade do produtos que voc� quer adicionar:");
		int quantidade = scan.nextInt();
		p.adicionarProduto(quantidade);
		//Mostrar a altera��es ap�s adi��o de Produto:
		System.out.println("Altera��o com adi��o de Produtos: " + "Nome: " + p.nome + "," + "Pre�o:R$ " 
		+p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
		+ "Total:R$ "+p.valorTotalEstoque());

		//Fazendo subitra��o  de Produtos:
		System.out.println("Digite a quantidade do produtos que voc� quer adicionar:");
		quantidade = scan.nextInt();
		p.removerProduto(quantidade);
		//Mostrar a altera��es ap�s subitra��o de Produto:
		System.out.println("Altera��o com adi��o de Produtos: " + "Nome: " + p.nome + "," + "Pre�o:R$ " 
		+p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
		+ "Total:R$ "+p.valorTotalEstoque());
	}
}
