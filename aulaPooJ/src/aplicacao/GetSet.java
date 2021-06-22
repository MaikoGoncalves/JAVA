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
		System.out.print(" Preço: ");
		p.preco = scan.nextDouble();
		System.out.print(" Quantidade: ");
		p.quantidade = scan.nextInt();

        // Mostrar a primeira parte:
		System.out.println("Nome: " + p.nome + "," + "Preço:R$ " 
        + p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
        + "Total:R$ "+p.valorTotalEstoque());
	   
		//Fazendo adição de Produtos:
		System.out.println("Digite a quantidade do produtos que você quer adicionar:");
		int quantidade = scan.nextInt();
		p.adicionarProduto(quantidade);
		//Mostrar a alterações após adição de Produto:
		System.out.println("Alteração com adição de Produtos: " + "Nome: " + p.nome + "," + "Preço:R$ " 
		+p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
		+ "Total:R$ "+p.valorTotalEstoque());

		//Fazendo subitração  de Produtos:
		System.out.println("Digite a quantidade do produtos que você quer adicionar:");
		quantidade = scan.nextInt();
		p.removerProduto(quantidade);
		//Mostrar a alterações após subitração de Produto:
		System.out.println("Alteração com adição de Produtos: " + "Nome: " + p.nome + "," + "Preço:R$ " 
		+p.preco + "," + " Quantidade em Estoque: "+p.quantidade+","
		+ "Total:R$ "+p.valorTotalEstoque());
	}
}
