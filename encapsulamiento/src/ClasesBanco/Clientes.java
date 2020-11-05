package ClasesBanco;

import java.util.Scanner;

public class Clientes {

	private String nombre;  // atributos del cliente
	private int monto;
	
	public Clientes (String nom) { // parametro
		/*Scanner ask = new Scanner (System.in);
		System.out.println("indique el nombre cliente");
		nombre = ask.next();
		
		System.out.println("indique el monto");
		monto = ask.nextInt();*/
		
		// constructo: nombre (objeto especifico al que refiere)
		nombre = nom;
		monto = 0; // se inicia el monto en cero (el monto se inicia para operar)
		
	}
	
	public void depositar (int m) {
		monto = monto + m;
	}
	
	public void extraer (int m) {
		monto = monto - m;
	}
	
	public int retornaMonto () {
		return monto;
		
	}
	
	public void imprimir () {
		System.out.println( nombre + " tiene deposito la suma de : " + monto);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
