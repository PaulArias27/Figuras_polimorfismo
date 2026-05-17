package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f = new Figura("Figuras", "verde");
		Cuadrado c = new Cuadrado("Cuadrado","rojo",5);
		Triangulo t = new Triangulo("Triangulo","azul",10,15,5,5);
		
		System.out.println(t);

	}

}
