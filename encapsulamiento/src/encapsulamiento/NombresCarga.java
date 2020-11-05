package encapsulamiento;

import java.util.Scanner;

public class NombresCarga {

	private String [] nombres;
	private String [] correo;
	
	
	public NombresCarga () {
		Scanner ask = new Scanner (System.in);
		nombres = new String [3];
		correo = new String [3];
		
		for (int i = 0; i < nombres.length; i++) {
		System.out.println(" ingrese su nombre");
		nombres [i]= ask.next();
			//for (int j =  0; j < nombres.length; j++) {
				System.out.println(" ingrese su correo");
				correo [i] = ask.next();
			}
		}	
	//}
	
	public void impresion () {
		for (int i = 0; i < nombres.length; i++) {
		System.out.println("los datos almacenados son nombre: "+ nombres[i] + "  correo " + correo[i]);
			//for (int j = 0; j < nombres.length; j++) {
				////System.out.println("los datos almacenados son " + nombres[i] + " y el correo" + correo[j]);
				//System.out.println("los datos almacenados son "+ correo[j]);
			//}
			
		}
	}
	
	public boolean retorno () {
		Scanner ask = new Scanner (System.in);
		String aux;
		boolean si = false; // boolean para evitar que se repita el ciclo
		System.out.println(" ingrese el nombre  para validar email");
			aux = ask.next();
			for (int i = 0; i < nombres.length; i++) {
				if (aux.equals(nombres[i])) { // condicional para verificar si se encuentra o no el nombre
					System.out.println(" el usuario está registrado y su correo es " + correo[i]);
					si = true; // rompe el ciclo z no vuelve a imprimir
				} 
			}   if (si == false) { // segundo condicional fuera del for para imprimir en caso de ser false
					System.out.println(" el usuario no está registrado" );
				}
				
		return false ;
		
	}
	
	public void verificar_mail () {
		
		char aux;
		for (int j = 0; j < correo.length; j ++) {
			boolean retor = false;
			for (int i = 0; i < correo.length; i++) {
			//aux = correo[i].charAt(0);
			if (correo[j].charAt(i) == '@') { // !!! VERIFICAR !!!
				//System.out.println(" el mail carece de '@'" + correo[i]);
				retor = true;
			} 
		}if (retor == false) {
				System.out.println(" todos los mails tienen '@'");
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		NombresCarga obj = new NombresCarga ();
		
		obj.impresion();
		obj.retorno();
		obj.verificar_mail();

	}

}
