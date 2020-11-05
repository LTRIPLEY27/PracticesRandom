package encapsulamiento;

import java.util.Scanner;

public class Operaciones {

	private Scanner ask;
	int valor1;
	int valor2;
	
	public Operaciones() {
		
		ask = new Scanner (System.in);
		
		System.out.println(" indique el primer valor");
		valor1 = ask.nextInt();
		
		System.out.println(" indique el segundo valor");
		valor2 = ask.nextInt();
		
	}
	
	public void suma () {
		int suma = valor1 + valor2;
		System.out.println(" la suma es igual a :" + suma);
	}
	
	public void resta () {
		int resta = valor1 - valor2;
		System.out.println(" la resta es igual a :" + resta);
	}
	
	public void multiplicacion () {
		int multiplicacion = valor1 * valor2;
		System.out.println(" la multiplicacion es igual a :" + multiplicacion);
	}
	
	public void division () {
		int division = valor1 / valor2;
		System.out.println(" la division es igual a :" + division);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones obj = new Operaciones();
		
		obj.suma();
		obj.resta();
		obj.multiplicacion();
		obj.division();
	}

}
