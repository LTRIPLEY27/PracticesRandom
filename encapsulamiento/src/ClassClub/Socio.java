package ClassClub;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	
	// constructor pedir carga por teclado.
	
	public Socio (Scanner ask) {  // se le indica el parametro Scanner para que haga la carga por teclado
		//Scanner ask = new Scanner (System.in);
		
		System.out.println(" ingrese el nombre del socio ");
		nombre = ask.next();
		
		System.out.println(" ingrese la antiguedad ");
		antiguedad = ask.nextInt();	
		
	}
	
	public void impresion () {
		System.out.println( nombre + " tiene antiguedad de " + antiguedad);
	}
	
	public int returnAntiguedad() {
		return antiguedad;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
