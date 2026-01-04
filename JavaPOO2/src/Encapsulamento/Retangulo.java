package Encapsulamento;

public class Retangulo {
	private double base;
	private double altura;
	public float getBase() {
		return (float) base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return (float) altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	} 
	public float calcularArea() {
	double area = base * altura;
	return (float) area;
	}
	public float calcularPerimetro() {
	double area1 = 2 * (base+ altura);
	return (float) area1;
}}