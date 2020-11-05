package encapsulamiento;

import java.util.Scanner;

public class TablaMultiplicar {

	
	private int tabla;
	private int terminos;
	
	public TablaMultiplicar(int ta) {
		tabla = ta;  // constructor 1
		terminos = 10;
	}
	
	
	public TablaMultiplicar(int ta, int ter) {
		tabla = ta;
		terminos = ter;	  // constructor 2 con 2 parametros
	}
	
	  public void imprimir() {
	        System.out.println("Tabla de multiplicar del "+tabla);
	        for(int f=1;f<=terminos;f++) {
	            int resultado=f*tabla;
	            System.out.println(tabla + "*" + f + " = " + resultado);
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TablaMultiplicar obj = new TablaMultiplicar(5);
		obj.imprimir();
		
		TablaMultiplicar obj1 = new TablaMultiplicar(9, 7);
		obj1.imprimir();
		
	}

}

