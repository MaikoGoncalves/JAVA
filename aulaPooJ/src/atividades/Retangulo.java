package atividades;

public class Retangulo {
	public double comp;
	public double alt;
	
	public double calcularArea() {
		double area;
		area=alt*comp;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro=2*(alt*comp);
		return perimetro;
	}
	public double calcularDiagonal() {
		double diagonal;
		diagonal=Math.sqrt(alt*comp);
		return diagonal;
	}
}