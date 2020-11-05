package encapsulamiento;

import java.util.Scanner;

public class Strings {
	
	private String palabra1;
	private String palabra2;
	
	public Strings () {
		Scanner ask = new Scanner (System.in);
		System.out.println("ingrese la primera cadena");
		palabra1 = ask.next();
		
		System.out.println("ingrese la segunda cadena");
		palabra2 = ask.next();
	}
	
	public boolean comproba () {
		
		if (palabra1.compareTo(palabra2) == 0) {
			System.out.println(" aprobado ");
		} else {
			System.out.println(" comparacion no exitosa ");
		}
		
		return false;
		
	}

	public boolean ignora_mayusculas () {
		
		if (palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("solo difieren en las mayúsculas y minúsculas");
		} else {
			System.out.println(" son cadenas distintas");
		}
		
		return false;
		
	}
	
	
	public boolean posicion () {
	char aux;
	
		for (int i = 0; i < palabra1.length(); i ++) {
			aux = palabra1.charAt(i);
			System.out.println(aux);
		}
		
		return false;
			
	}
	
	public boolean longitud () {
		
		int a;
		int b;
		
		System.out.println(palabra1.length());
		System.out.println(palabra2.length());
		a = palabra1.length();
		b = palabra2.length();
		
		if (a < b) {
			System.out.println(" la palabra 2 tiene mayor longitud");
		} else if (a > b) {
			System.out.println(" la palabra 1 tiene mayor longitud");
		} else {
			System.out.println(" ambas palabras tienen la misma extension ");
		}
		return false;	
	}
	
	public boolean substraccion () {
		
		if (palabra1.length() < palabra2.length()) {
			System.out.println(palabra1.substring(2));
		} else {
			System.out.println(" no aplica ");

		}
		
		return false;
		
	}
	
	public boolean repite () {
		char aux;
		//if (palabra2.indexOf('e')) {
		 System.out.println(palabra1.indexOf('a')); // indice (int) donde aparece el caracter
		 System.out.println(palabra1.indexOf('a', 3)); //posicion  que repite el caracter luego de "indice 3". 
		 System.out.println(palabra1.indexOf("ae")); // posicion del indice de una subcadena
		//}
		return false;
		
	}
	
	public boolean mayuscula () {
		
		System.out.println(palabra1.toUpperCase()); // convierte toda la cadena en mayusculas
		System.out.println(palabra2.toLowerCase()); // inverso al anterior
		
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strings obj = new Strings ();
		
		obj.comproba();
		obj.ignora_mayusculas();
		obj.posicion();
		obj.longitud();
		obj.substraccion();
		obj.repite();
		obj.mayuscula();
	}

}
