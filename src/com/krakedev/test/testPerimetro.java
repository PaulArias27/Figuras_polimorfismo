package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class testPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f = new Figura("Figuras", "verde");
		Cuadrado c = new Cuadrado("Cuadrado","rojo",5);
		Triangulo t = new Triangulo("Triangulo","azul");
		Rectangulo r = new Rectangulo("Rectangulo", "Amarillo",5 , 10);
	
		
		System.out.println(c.calcularPerimetro());
		System.out.println(r.calcularPerimetro());


	}

}
