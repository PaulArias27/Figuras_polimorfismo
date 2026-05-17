package com.krakedev.figuras;

public class Figura {
	private String nombre;
	private String color;
	
	//constructores
	
	
	
	public Figura(String nombre,String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	//metodos
	public int calcularPerimetro() {
		return 0;
	}
	
	
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
