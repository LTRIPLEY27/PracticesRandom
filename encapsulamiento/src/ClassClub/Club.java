package ClassClub;

import java.util.Scanner;

public class Club {
	
	private Socio socio1, socio2, socio3;
	private Scanner ask;
	
	// método impresion socio mazor antiguedad
	
	public Club () {
		ask = new Scanner (System.in);
		socio1 = new Socio (ask);
		socio2 = new Socio (ask);
		socio3 = new Socio (ask);
	}
	
	public void antiguedadmas () {
		System.out.println(" socio mayor antiguedad ");
		if (socio1.returnAntiguedad() < socio2.returnAntiguedad() && socio3.returnAntiguedad() > socio2.returnAntiguedad()) {
			socio3.impresion();
			//System.out.println(" el socio de mayor antiguedad es " + socio3.returnAntiguedad());
		} else {
			if (socio1.returnAntiguedad() < socio2.returnAntiguedad() && socio3.returnAntiguedad() < socio2.returnAntiguedad()) {
				socio2.impresion();
			} else {
				socio1.impresion();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Club obj = new Club ();
		obj.antiguedadmas();

	}

}
