package com.krakedev.figuras;

public class Rectangulo extends Figura{
	
	private int base;
	private int altura;
	
	//constructor
	public Rectangulo(String nombre,String color,int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	
	//metodo
	public int calcularPerimetro() {
		return 2 * base + 2 * altura;
	}
	
	

}
