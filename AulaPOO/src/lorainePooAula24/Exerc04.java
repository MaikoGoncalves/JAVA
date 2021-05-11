package lorainePooAula24;


import java.util.Date;

public class Exerc04 {

	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.isbn = " abc123456";
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.nomeEmpr = "Maiko";
		
		System.out.println("Nome do livro = "+ livro.nome);
		System.out.println("Autor = "+ livro.autor);
		System.out.println("ISBN = "+ livro.isbn);
		System.out.println("Emprestado = "+ livro.nomeEmpr);
		System.out.println("Data "+ livro.dataEntrega);
		
		
		
	}

}
