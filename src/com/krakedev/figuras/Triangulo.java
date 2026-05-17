package com.krakedev.figuras;

public class Triangulo extends Figura{
	
	private int base;
    private int altura;
    private int lado1;
    private int lado2;
	
	//constructor
	public Triangulo(String nombre,String color,int base, int altura,int lado1, int lado2) {
		super(nombre,color);
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//metodos
	 @Override
	 public int calcularPerimetro() {
	     return base + lado1 + lado2;
	 }

	 @Override
	 public double calcularArea() {
		 return (base * altura) / 2.0;
	 }
}
