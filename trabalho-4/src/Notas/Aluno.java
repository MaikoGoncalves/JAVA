package Notas;

public class Aluno {
	public String nome;
	public double[] nota = new double[3];
	//public double soma = 0;

	public double calculo(double soma) {
		//double soma=0;
		double verificar = 60, resultado=0;
		if (soma >= 60) {
			System.out.println("Aprovado");
			System.out.println();
			
		} else {
			resultado = verificar - soma;
			System.out.println("Reprovado");
			System.out.println("Faltou : " + resultado);
			System.out.println();
		
		}
	return soma;
	}
	public void imprimir(double soma) {
		System.out.println("O nome do aluno : " + nome);
		System.out.println("A nota : " + soma);
	}
}