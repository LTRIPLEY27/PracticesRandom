package encapsulamiento;

public class main {

	public static void main(String[] args) {
					// con el "new" se invoca al constructor, lo cual da acceso a los atributos de la clase automovil
		Automovil obj = new Automovil ("BMW","2010");
		
		
		System.out.println(obj);
		
		obj.setModelo("2017");// el m�todo set aplica el valor a modificar
		
		System.out.println(" se ha modificado su m�todo a " + obj.getModelo());// m�todo "get" consulta el valor que se le indica del String
	}

}
