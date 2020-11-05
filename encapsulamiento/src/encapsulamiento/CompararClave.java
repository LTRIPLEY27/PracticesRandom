package encapsulamiento;

import java.util.Scanner;

public class CompararClave {

	private String clave;
	
	public CompararClave (){ // constructor
		Scanner ask = new Scanner (System.in);
		
		System.out.println(" ingrese la cave a verificar");
		clave = ask.next();
		
	}
	
	public String comparar () { // método a verificar los datos del constructor
		String comprueba = "123abc";
		if (clave.equals("123abc") == true) {
			System.out.println("clave admitida");
		} else {
			System.out.println("clave no admitida");
		}
		
		return clave;
		
	}
	
	public static void main(String[] args) {
		CompararClave obj = new CompararClave ();
		
		obj.comparar();

	}

}
