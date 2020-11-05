package encapsulamiento;

import java.util.Scanner;

public class Oracion {
	
	private String [] oracion;
	
	
	public Oracion () {
		Scanner ask = new Scanner (System.in);
		String aux;
		System.out.println("ingrese la oracion");
		aux = ask.nextLine();
		
		oracion = new String [aux.length()];
		for (int i = 0; i < oracion.length; i++) {
			oracion [i] = aux;
		}
		
	}
	
	public void carga() {
		for (int i = 0; i < oracion.length; i++) {
			System.out.println(oracion[i].charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		Oracion obj = new Oracion ();
		obj.carga();

	}

}
