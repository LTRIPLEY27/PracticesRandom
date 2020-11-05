package encapsulamiento;

import java.util.Scanner;

public class MailStrings {

		private String direccion;
		
		public MailStrings() {
			Scanner ask = new Scanner (System.in);
			System.out.println(" ingrese la direccion electronica" );
			direccion = ask.next();
		}
		
		public boolean comprobar () {
			
			if (direccion.indexOf('@')>0) {
				System.out.println(" la direccion contiene el @");
			} else {
				System.out.println(" la direccion no contiene el @");
			}
			return false;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailStrings obj = new MailStrings ();
		
		obj.comprobar();
	}

}
