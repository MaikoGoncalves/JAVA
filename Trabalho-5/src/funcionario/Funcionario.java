package funcionario;

public class Funcionario {
			
	public String nome;
	public double salarioBruto;
	public double salarioNovo;
	public double imposto;
	public double vImposto;
	public double vAumento;
				
	public double calcularImposto() {
	if (salarioBruto < 500) {
		imposto=5;
		salarioNovo = salarioBruto - ((salarioBruto  * imposto)/100 );
		vImposto = salarioBruto - salarioNovo;
	}
	if (salarioBruto >=500 & salarioBruto <= 850) {
		imposto=10;
		salarioNovo = salarioBruto - ((salarioBruto  * imposto)/100 );
		vImposto = salarioBruto - salarioNovo;
	}
	else {
		imposto = 15;
		salarioNovo = salarioBruto - ((salarioBruto  * imposto)/100 );
		vImposto = salarioBruto - salarioNovo;
	    } 
	return salarioNovo; 	
    }
	
	public double novoSalario() {
		if(salarioBruto<450) {
			vAumento=100;
		   salarioBruto=salarioBruto + vAumento;
		}
		if (salarioBruto>=450 & salarioBruto<750) {
			vAumento=75;
			salarioBruto=salarioBruto + vAumento;
		}
		if (salarioBruto>=750 & salarioBruto<=1500) {
			vAumento=50;
			salarioBruto=salarioBruto + vAumento;
		}else {
			vAumento=25;
			salarioBruto=salarioBruto + vAumento;
		     }
		return salarioBruto;
	    }
	}