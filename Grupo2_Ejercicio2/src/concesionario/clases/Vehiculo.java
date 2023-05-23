package concesionario.clases;

public class Vehiculo implements Comparable<Vehiculo> {

	//Atributos
	private String marca;
	private String modelo;
	private String anyo;
	private int precio;
	
	//Constructor
	public Vehiculo(String marca, String modelo, String anyo, int precio) {
		super();
		setMarca(marca);
		setModelo(modelo);
		setAnyo(anyo);
		setPrecio(precio);
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (!marca.isEmpty()) {
			this.marca = marca;
		} else {
			throw new ArithmeticException("ERROR. La marca no puede estar vacía.");
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (!modelo.isEmpty()) {
			this.modelo = modelo;
		} else {
			throw new ArithmeticException("ERROR. El modelo no puede estar vacía.");
		}
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		if (!anyo.isEmpty()) {
			this.anyo = anyo;
		} else {
			throw new ArithmeticException("ERROR. El año no puede estar vacía.");
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ArithmeticException("ERROR. El precio no puede ser inferior a 0");
		}
	}

	//Metodos
	@Override
	public int compareTo(Vehiculo o) {
		return o.getPrecio() - this.getPrecio();
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + this.marca + ", modelo=" + this.modelo + ", anyo=" + this.anyo + ", precio=" + this.precio + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Vehiculo nuevo = (Vehiculo) obj;
		boolean result = false;
		
		if(this.getMarca().equals(nuevo) && this.getModelo().equals(nuevo) 
				&& this.anyo.equals(nuevo) && this.getPrecio() == nuevo.getPrecio()) {
			result = true;
		}
		return result;
	}
}