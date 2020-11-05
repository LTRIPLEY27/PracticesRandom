import java.util.Scanner;

public class CaballoMove {

	public static void main(String[] args) {
		//6.(obligatori entrega) Un taulell d'escacs es una matriu de 8 × 8 cel·
		//les. Cada cel·la es pot representar amb les seves coordenades de fila i
		//columna, numerades del 1 fins al 8.
		//El cavall és una peça que es desplaça en forma de L: avançar 2 cel·les 
		//en una direcció i després una cel·la en una direcció perpendicular a la 
		//primera:
		//Escriu un programa que donades les coordenades on està un cavall, indiqui
		//totes les cel·les on es pot desplaçar.
		Scanner teclat= new Scanner (System.in);
		int [][] tablero;
		tablero = new int [8][8];
		int [][] movimientos;
		movimientos = new int [8][8];
		int fil,col;
		boolean respuesta = true;

		for (int f=0; f<tablero.length; f++) {
			for (int c=0; c<tablero[f].length; c++) {
				tablero[f][c] = 0;
			}	
		}
		// impresion del tablero
		for (int f=0; f<tablero.length; f++) {
			for (int c=0; c<tablero[f].length; c++) {
				System.out.print(tablero[f][c] + "-");
			}	
			System.out.println("-");
		}
		// inicio de los datos del caballo
		System.out.println("indique la ubicacion donde desea colocar al caballo");
		System.out.println("indique la fila ");
		fil = teclat.nextInt();
		System.out.println("indique la columna ");
		col = teclat.nextInt();

		if (fil<8 && col <8) {
			respuesta = true;
			System.out.println(" la posicion es valida");
		}else {
			respuesta = false;
			System.out.println("no se pueden ejecutar movimientos pues la posicion es invalida");
			//teclat.close();
		}

		//if (true) {
			System.out.println("la ubicacion del caballo y sus potenciales movimientos  es la siguiente:  ");
			for (int f=0; f<tablero.length; f++) {
				for (int c=0; c<tablero[f].length; c++) {
					//while (tablero)
					tablero[fil][col]= 5; // caballo inicial 
					tablero[fil-2][col-1]= 1; // primer movimiento L (retrocedo 2 filas y retrocedo una columna)
					tablero[fil-2][col+1]= 1;// primer movimiento L (retrocedo 2 filas y avanzo una columna)
					tablero[fil-1][col-2]= 1;//
					tablero[fil+1][col-2]= 1;
					tablero[fil+1][col+2]= 1;
					tablero[fil+2][col-1]= 1;
					tablero[fil+2][col+1]= 1;
					tablero[fil-1][col+2]= 1;
					tablero[fil+1][col+2]= 1;
				
				
					System.out.print(tablero[f][c] + "-");
				}	
				System.out.println("-");
			}
		}

			}
			//}


