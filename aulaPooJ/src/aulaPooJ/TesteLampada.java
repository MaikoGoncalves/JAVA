package aulaPooJ;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
        Lampada lamp1 = new Lampada();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o modelo da L�mpada");
        lamp1.modelo = sc.nextLine();
        System.out.println("Digite a Pot�ncia L�mpada");
        lamp1.potencia = sc.nextInt();
        		
		
		lamp.modelo = "A60";
		lamp.tensao = "Bivolt";
		lamp.garantiaMeses = 36;
		lamp.potencia = 7;
		lamp.cor = "Amarela";
		lamp.tipoLuz = "Amarela";
		lamp.tipoAbajur = false;

		lamp.tipos = new String[5];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[1] = "Lampe�es";

		System.out.println(" L�mpada 1");
		System.out.println(" Cor da L�mpada: " + lamp.cor);
		System.out.println(" Modelo L�mpada: " + lamp.modelo);
		System.out.println(" Pot�ncia da L�mpada: " + lamp.potencia);

		System.out.println(" L�mpada 2");
		System.out.println(" Modelo L�mpada: " + lamp1.modelo);
		System.out.println(" Pot�ncia L�mpada: " + lamp1.potencia);
	}

}
