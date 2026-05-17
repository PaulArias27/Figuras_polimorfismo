package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador g = new Graficador();
		Figura f = new Figura("Figuras", "verde");
		Cuadrado c = new Cuadrado("Cuadrado","rojo");
		Rectangulo r = new Rectangulo("Rectangulo", "Amarillo");
		
		g.graficar(f);
		g.graficar(c);
		g.graficar(r);
		
	}

}
