package encapsulamiento;

import java.util.Scanner;

public class Empleado {

	String nombre;
	int sueldo;
	private Scanner ask;
	
	public Empleado () {
		
		ask = new Scanner (System.in);  // solo porque no se actualiza el parametro
		System.out.println("indique el nombre");
		nombre = ask.next();
		
		System.out.println("indique el sueldo");
		sueldo = ask.nextInt();
	}
	
	public boolean respuesta () {   // solo se indica por parametros cuando el constructor modifica "setter" and getter
		if (sueldo < 3000) {
			System.out.println("el empleado es " + nombre + " y su sueldo es " + sueldo);
		} else if (sueldo > 3000) {
			System.out.println("el empleado es " + nombre + " y su sueldo es " + sueldo + " ha de pagar impuestos");
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado obj = new Empleado();
		
		obj.respuesta();
	}

}
