package JuegoDados;

public class Dados {

	private int tiro;  // atributos de la clase
	// almacena el valor aleatorio al tirar el dado
	//public Dados () {
		 // esta clase carece de constructor, solo de m�todos
	//}
	
	public void tirar () {  // m�todo a llamar el math ramdon del 1 al 6
		tiro = 1 + (int) (Math.random() * 6); //  se almacena en el atributo tiro
	}
	
	public void imprimir () { // metodo impresion del valor almacenado en el m�todo anterior
		System.out.println( " valor " + tiro);
	}
	
	public int returnValor () { // m�todo de return del m�todo tirar
		return tiro; // es utilizado por juego para comparar los valores de los 3 dados z responder si perdio o gano
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
