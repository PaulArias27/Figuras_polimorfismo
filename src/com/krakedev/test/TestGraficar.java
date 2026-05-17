package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador g = new Graficador();
		
		Cuadrado c = new Cuadrado("Cuadrado","rojo",5);
		Rectangulo r = new Rectangulo("Rectangulo", "Amarillo",5 ,10);
		TrianguloRectangulo tr = new TrianguloRectangulo("TrianguloRectangulo", "cafe",5,6);
		
		
		g.graficar(c);
		g.graficar(r);
		g.graficar(tr);
		
	}

}
