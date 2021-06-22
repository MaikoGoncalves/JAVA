package lanchonete;

public class Produto {
	
	private int tam = 7;
	private int[] cod = new int[tam];{
	 cod[0]=1;
	 cod[1]=2;
	 cod[2]=3;
	 cod[3]=4;
	 cod[4]=5;
	 cod[5]=6;
	 cod[6]=7;
	 }	
	private String[] nome = new String[tam];{
	 nome[0] = "Carrocho Quente";
	 nome[1] = "X-TUDO";
	 nome[2] = "Bauru Com Ovo";
	 nome[3] = "Hamburguer";
	 nome[4] = "Cheeseburguer";
	 nome[5] = "Suco";
	 nome[6] = "Refrigerante";
	 }
	private double[] preco = new double[tam];{
	 preco[0] = 10;
	 preco[1] = 17;
	 preco[2] = 15;
	 preco[3] = 15;
	 preco[4] = 15;
	 preco[5] = 5;
	 preco[6] = 4;
	}
	private int[] qtd = new int[tam];
	private double[] total = new double[tam];
	
	public int[] getCod() {
		return cod;
	}
	public void setCod(int[] cod) {
		this.cod = cod;
	}
	public String[] getNome() {
		return nome;
	}
	public void setNome(String[] nome) {
		this.nome = nome;
	}
	public double[] getPreco() {
		return preco;
	}
	public void setPreco(double[] preco) {
		this.preco = preco;
	}
	public int[] getQtd() {
		return qtd;
	}
	public void setQtd(int[] qtd) {
		this.qtd = qtd;
	}
	public double[] getTotal() {
		return total;
	}
	public void setTotal(double[] total) {
		this.total = total;
	}

	public void setFazerPedido(int cod, int qtd) {
		this.qtd[cod-1]=this.qtd[cod-1]+qtd;		
		
	}
	
	public void setImprimir() {
		double valor=0, valorTotal=0;
		for(int x=0; x<7;x++) {
		
		if(this.qtd[x]>0) {
			valor=this.qtd[x]*this.preco[x];
			System.out.println(this.nome[x] +" = " + this.qtd[x]+ " * " + this.preco[x] + " =R$"+valor);
		    valorTotal=valorTotal+valor; 
		   }
		}
		System.out.println("Valor total do pedido = R$ "+ valorTotal);
	}
}
