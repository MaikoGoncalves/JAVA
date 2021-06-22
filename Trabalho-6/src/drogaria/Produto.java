package drogaria;

public class Produto {

	private int tam = 15, i = 1;
	private int[] codigo = new int[tam];
	private String[] nome = new String[tam];
	private double[] precoCusto = new double[tam];
	private double[] porc = new double [tam];
	private double[] precoVenda = new double [tam];
	private String[] dataVenc = new String[tam];

	public int[] getCodigo() {
		return codigo;
	}

	public void setCodigo(int[] codigo) {
		this.codigo = codigo;
	}

	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public double[] getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double[] precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double[] getPorc() {
		return porc;
	}

	public void setPorc(double[] porc) {
		this.porc = porc;
	}

	public double[] getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double[] precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String[] getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(String[] dataVenc) {
		this.dataVenc = dataVenc;
	}

	//
	public boolean verificarCod(boolean b, int pos) {

		if (i <= tam) {
			b = true;
			this.codigo[pos] = i;
			i++;
			return b;
		} else {
			System.out.println("Limite Maximo");
			b = false;
			return b;
		}
	}

	public void setNomeProduto(int pos, String nome) {
		this.nome[pos] = nome;
	}
	public void setPrecoCusto(int pos, double preco) {
		this.precoCusto[pos] = preco;
	}
	public void setPorc(int pos, double porc) {
		this.porc[pos] = porc;
		setPrecoVenda(pos);
	}
    private void setPrecoVenda(int pos) {
	   this.precoVenda[pos]=this.precoCusto[pos]+(this.precoCusto[pos]*this.porc[pos]/100);
    }

    public void setDataVenc(int pos, String data) {
    	this.dataVenc[pos]=data;
    }
    
    public int precoMaior(int pos) {
    	    double aux=0;
    	    int m=0;
    	    for(int j = 0 ; j < pos ; j++ ) {
    		if(aux < this.precoVenda[j]) {
    			aux = this.precoVenda[j];
    			m=j;
    		}
    	}
    	return m;
    }
    	
    public void imprimir(int pos){
    	 for (int i=0 ; i < pos ; i++ ) {
		     System.out.println("***********************************");	
			 System.out.println("* Codigo: " + getCodigo()[i]);
			 System.out.println("* Nome: " + getNome()[i]);
			 System.out.println("* Preço de Custo: R$ " + getPrecoCusto()[i]);
			 System.out.println("* Preço de Venda: R$ " + getPrecoVenda()[i]);
			 System.out.println("* Data de Vencimento: " + getDataVenc()[i]);
			 System.out.println("***********************************");	
			 System.out.println();	
			}
    }

    public void imprimirMaior(int x){
   	         System.out.println("***********************************");	
			 System.out.println("* Codigo: " + getCodigo()[x]);
			 System.out.println("* Nome: " + getNome()[x]);
			 System.out.println("* Preço de Custo: R$ " + getPrecoCusto()[x]);
			 System.out.println("* Preço de Venda: R$ " + getPrecoVenda()[x]);
			 System.out.println("* Data de Vencimento: " + getDataVenc()[x]);
			 System.out.println("***********************************");	
			 System.out.println();	
			}
   

    
    
}