package encapsulamiento;

import java.util.Scanner;

public class MultiplesStrings {
	
	private String cadena;
	
	public MultiplesStrings () {
		Scanner ask = new Scanner (System.in);
		
		System.out.println(" ingrese la cadena a trabajar");
		cadena = ask.next();
		
	}
	
	public boolean mitad_cadena () {
		String aux;
		int x;
		x = cadena.length()/2;
		aux = cadena.substring(0, x);
		System.out.println(" la primera mitad de caracters son: " + aux);
		
		return false;
		
	}
	
	public boolean last () {
		char aux;
		aux = cadena.charAt(cadena.length()-1);
		System.out.println(" ultima letra: " + aux);
		return false;
		
	}
	
	public void inverso () {
		char x;
		String  aux;
		
		System.out.println("la inversa: ");
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
			//aux =  x;
			//System.out.println(x);
		}
		System.out.println();
		//return cadena;
	}
	
	public void separado () {
		char aux;
		System.out.println("caracteres separados");
		for (int i = 0; i < cadena.length(); i++) {
			//aux = cadena.charAt(i);
			System.out.print(cadena.charAt(i) + "-");
		}
		System.out.println();
		//return cadena;
		
	}
	
	public String vocal () {
		
		char aux;
		char x;
		int cont = 0;
		for (int i = 0; i < cadena.length(); i++) {
			aux = cadena.charAt(i);
			if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
				cont++;
				cadena.indexOf(i);
			}		
		}
		System.out.println(" la cantidad de vocales es : " + cont);
		return cadena;
		
	}
	
	public String igual () {
		
		char aux;
		char x;
		
		for (int i = 0; i < cadena.length(); i ++ ) {
			aux = cadena.charAt(i);
			for (int j = 0; j < cadena.lastIndexOf(cadena.length()); j ++) {
				x = cadena.charAt(j);
				if (aux == x) {
					System.out.println("se lee igual de izquierda a derecha");
				} else {
					System.out.println("no se lee igual de izquierda a derecha");
				}
				System.out.println(x);
			}
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplesStrings obj = new MultiplesStrings();
		obj.mitad_cadena();
		obj.last();
		obj.inverso();
		obj.separado();
		obj.vocal();
		obj.igual();
		
	}

}
