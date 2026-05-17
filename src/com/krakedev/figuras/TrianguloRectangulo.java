package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{
	
	private int catetoA;
	private int catetoB;
	private int hipotenusa;
	
	//contructor
	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre,color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		
		this.hipotenusa = catetoA * catetoA + catetoB * catetoB;
	}
	
	//metodos
	 @Override
	    public int calcularPerimetro() {
	        return catetoA + catetoB + hipotenusa;
	    }

	 @Override
	    public double calcularArea() {
	        return (catetoA * catetoB) / 2;
	    }
}
