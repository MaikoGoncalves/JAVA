package loianeAula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van1 = new Carro();
		System.out.println(van1.numPassageiros);
		
		Carro van2 = new Carro("Fiat", "Ducato");
		
		System.out.println("Marca do carro 2: " + van2.marca);
		System.out.println(van2.modelo);

	}

}
