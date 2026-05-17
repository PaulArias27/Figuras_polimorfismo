package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class testPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f1 = new Figura("Figuras", "verde");
		Figura f2  = new Cuadrado("Cuadrado","rojo",5);
		Figura f3  = new Triangulo("Triangulo","azul");
		Figura f4  = new Rectangulo("Rectangulo", "Amarillo",5 , 10);
		
	
		
		System.out.println(f1.calcularPerimetro());
		System.out.println(f2.calcularPerimetro());
		System.out.println(f4.calcularPerimetro());


	}

}
