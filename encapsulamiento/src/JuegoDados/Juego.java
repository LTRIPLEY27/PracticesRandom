package JuegoDados;

public class Juego {

	private Dados dado1, dado2, dado3;// de esta forma se declara los tres objetos de la clase dados
	
	public Juego () {
		dado1 = new Dados (); // se indica el objeto aun sin valor
		dado2 = new Dados ();// el constructor crea los objetos
		dado3 = new Dados ();
	}
	
	public void jugar () { // metodo jugar
		dado1.tirar(); // llama al método de la clase dado
		dado1.imprimir(); // imprime el resultado del método
		dado2.tirar();  
		dado2.imprimir();
		dado3.tirar();
		dado3.imprimir();
		// condicional de si los valores son iguales entonces gana
		if (dado1.returnValor() == dado2.returnValor() && dado1.returnValor() == dado3.returnValor()) {
			System.out.println("gano");
		} else { 
			System.out.println("perdio");
		}
	}
	
	public static void main(String[] args) {
		Juego obj = new Juego (); // declaracion del objeto
		obj.jugar();
	}

}
