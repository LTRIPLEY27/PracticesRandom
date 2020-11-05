package encapsulamiento;

public class Automovil {

	private String marca;// atributos
	private String modelo;
	
	// constructor
	public Automovil (String marca, String modelo) {
		this.marca = marca; // por cada objeto que se cree se demandaran los parámetros del constructor
		this.modelo = modelo;
	}
	
	public String getMarca () {// métodos getter and setter
		return (this.marca); // método consultar pero no modificar
	}
	
	public  void setMarca(String marca) {
		this.marca = marca;  // modificar el valor pero no retorna
	}
	
	public String getModelo() {
		return (this.modelo);
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	@Override // sobreescribe el método
	public String toString() { // método "toString" 
		return "Automovil [marca=" + marca + ", modelo=" + modelo + "]";
	}  // el "toString" consulta y modifica los atributos del main con el parámetro del método "setModelo"

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
