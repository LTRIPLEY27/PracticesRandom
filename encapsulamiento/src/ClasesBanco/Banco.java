package ClasesBanco;

public class Banco {

	private  Clientes cliente1, cliente2, cliente3; // identificacion del numero de objetos de la clase cliente
	
	public Banco () {  /// constructor con parametro nombre del cliente
		cliente1 = new Clientes ("juan");
		cliente2 = new Clientes ("Ana");
		cliente3 = new Clientes ("Stefan");
	}
	
	public void operar () {
		cliente1.depositar(100);
		cliente2.depositar(200);
		cliente3.extraer(250);
	}
	
	public void depositos_totales () {
		int t = cliente1.retornaMonto () + cliente2.retornaMonto () + cliente3.retornaMonto();
		System.out.println( " el total del monto es" + t);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	
	}
	

	public static void main(String[] args) {
		Banco obj = new Banco();
		obj.operar();
		obj.depositos_totales();

	}

}
