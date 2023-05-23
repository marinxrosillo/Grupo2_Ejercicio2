package concesionario;

public class Coche extends Vehiculo {
	
	//Atributos
	private String tipo;
	private int capacidad;
	
	//Constructor
	public Coche(String marca, String modelo, String anyo, int precio, String tipo, int capacidad) {
		super(marca, modelo, anyo, precio);
		setTipo(tipo);
		setCapacidad(capacidad);
		
	}

	//Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (!tipo.isEmpty()) {
			this.tipo = tipo;
		} else {
			throw new ArithmeticException("ERROR. La marca no puede estar vacía.");
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		if (capacidad > 0) {
			this.capacidad = capacidad;
		} else {
			throw new ArithmeticException("ERROR. El precio no puede ser inferior a 0");
		}
	}
	@Override
	public String toString() {
		return "Coche [tipo=" + this.tipo + ", capacidad=" + this.capacidad +"marca= + " + super.getMarca() + ", modelo=" + super.getModelo() + ", anyo=" + super.getAnyo() + ", precio=" + super.getPrecio() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Coche nuevo = (Coche) obj;
		boolean result = false;
		if(super.equals(nuevo) && this.capacidad == nuevo.capacidad && this.tipo.equals(nuevo)) {
			result = true;
		}
		return result;
	}
	
	
	
	
	
	
	

}