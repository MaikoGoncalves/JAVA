package atividades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
		
	public double calcularNovoSalario() {
		double salarioLiquido;
		salarioLiquido = salarioBruto - ((salarioBruto  * taxa)/100 ); 
        return salarioLiquido; 	
	}	
	public double calcularAumentoSalario(double porcentagem) {
		//double salarioNovo;
	   	salarioBruto = salarioBruto + ((salarioBruto  * porcentagem)/100 ); 
        return salarioBruto; 
	}

	public void mostrarDados()
	{
		System.out.println("Nome " + nome + ", " + "Sal�rio: " + salarioBruto);
		System.out.println("O Sal�rio L�quido �: " + calcularNovoSalario());
	}


}