package encapsulamiento;

import java.util.Scanner;

public class CargaEmpleados {
	private Scanner teclat; // atributos clase CargaEmpleados
	private int [] sueldos;
	

	public  CargaEmpleados () { // constructor
		teclat = new Scanner (System.in);
		
		// constructor
		sueldos = new int [5];
		
		for (int i = 0; i < sueldos.length; i++ ) {
		System.out.println("ingrese los sueldos ; ");
		sueldos[i] = teclat.nextInt(); // regoge datos
		
		}
	}
		
		public void impresion() { // metodo impresion
			for (int i =0; i < 5; i++) {
				System.out.println(sueldos[i]);
			}
		}
		
	
	
	public static void main(String[] ar) {
		
	/*
	 * Se desea guardar los sueldos de 5 operarios en un vector. 
	 * Realizar la creación y carga del vector en el constructor.	
	 */
		
		// creacion del objeto
		CargaEmpleados obj = new CargaEmpleados();
		obj.impresion(); // llamado al metodo
	}

}
	

