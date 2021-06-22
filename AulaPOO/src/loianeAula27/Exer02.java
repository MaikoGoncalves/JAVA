package loianeAula27;

public class Exer02 {

  public static void main(String[] args) {
		
	ContaCorrente conta = new ContaCorrente();
	conta.numero = "123456";
	conta.agencia= "1234";
	conta.especial = true;
	conta.limiteEspecial = 500;
	conta.valorEspecialUsado = 0;
	conta.saldo = -10;
		
	System.out.println("Saldo da conta: "+conta.numero+" = "+conta.saldo);
    boolean saqueEfetuado = conta.realizarSaque(50);
    
    if (saqueEfetuado) {
    	System.out.println("Saque efutuado com sucesso");
    	conta.consultarSaldo();
    }else {
    	
    	System.out.println("N�o foi poss�vel realizar saque. Saldo insufuciente");
    }
	conta.depositar(500);
	conta.consultarSaldo();
	conta.realizarSaque(60);
	
	if (conta.verificarUsoChequeEspecial()){
		System.out.println("Est� usando cheque especial");
	}else {
		System.out.println("N�o est� usando o cheque especial");
	}
	
  }
}
