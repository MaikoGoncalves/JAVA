package prova;

public class ProvaExer1 {

	private double a = 0;
	private double b = 0;
	private double c = 0;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setConc() {
		if (this.a > 0) {
			System.out.println("Concavidade voltada para cima.");
		}
		if (this.a < 0) {
			System.out.println("Concavidade voltada para baixo.");
		}
	}

	public void setValorDelta() {
		double delta = 0;
		delta = (this.b * this.b)  -4 * (this.a * this.c);
		if (delta == 0) {
			System.out.println("Existe uma raiz real.");
		}
		if (delta < 0) {
			System.out.println("Não a raiz real.");
		}
		if (delta > 0) {
			System.out.println("Existem 2 raizes.");

		}
		System.out.println("Valor do Delta: " + delta);
	}

	public void setValorX() {

	}

}
