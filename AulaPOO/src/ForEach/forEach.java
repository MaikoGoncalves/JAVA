package ForEach;

import java.util.Random;
public class forEach {

	public static void main(String[] args) {
		
		int [] notas = new int [10];
		
		Random random = new Random();
		
		for (int i=0; i<notas.length;i++) {
			notas[i] = random.nextInt(10);
			
			System.out.println(notas[i]);
		}
	  System.out.println("Usando o for each");	
      for (int nota : notas) {
    	  System.out.println(nota); 
      }
		
	}

}
