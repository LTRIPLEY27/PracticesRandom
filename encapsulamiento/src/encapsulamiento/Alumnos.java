package encapsulamiento;

import java.util.Scanner;

public class Alumnos {

	private String  nombre;
	private int edad;
	
	public Alumnos() {
		Scanner ask = new Scanner (System.in);
		////System.out.println(" cuantos alumnos desea");
		
		System.out.println(" ingrese nombre : ");
		nombre = ask.next();
		
		System.out.println(" ingrese edad : ");
		edad = ask.nextInt();
	}
	
	public void impresion () {
		System.out.println(" el alumno es " + nombre + " y la edad es " + edad);
	}
	
	public boolean verificar () {
		
		if (edad >= 18 ) {
			System.out.println(" es mayor de edad");
		} else {
			System.out.println(" es menor de edad");
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumnos alum = new Alumnos ();
		alum.impresion();
		alum.verificar();
	}

}
