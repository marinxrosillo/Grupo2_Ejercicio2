package concesionario;

import java.util.LinkedList;
import java.util.List;

public class Cliente implements Comparable<Cliente> { 
	
	//Atributos
	private String nombre;
	private String direccion;
	private List<Vehiculo> vehiculosComprados;
	
	//Constructor
	public Cliente(String nombre, String direccion) {
		super();
		setNombre(nombre);
		setDireccion(direccion);
		this.vehiculosComprados = new LinkedList<>();
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre){
		if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new ArithmeticException("ERROR. El nombre no puede estar vacío.");
        }
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if (!direccion.isEmpty()) {
            this.direccion = direccion;
        } else {
            throw new ArithmeticException("ERROR. La dirección no puede estar vacía.");
        }
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + this.nombre + ", direccion=" + this.direccion + ", vehiculosComprados=" + this.vehiculosComprados
				+ "]";
	}
	
	public List<Vehiculo> getVehiculosComprados() {
		return vehiculosComprados;
	}

	public void setVehiculosComprados(List<Vehiculo> vehiculosComprados) {
		this.vehiculosComprados = vehiculosComprados;
	}

	@Override
	public boolean equals(Object obj) {
		Cliente nuevo = (Cliente) obj;
		boolean result = false; 
		
		if (this.getDireccion().equals(nuevo.getDireccion()) && this.getNombre().equals(nuevo.getNombre()) 
				&& this.getVehiculosComprados().equals(nuevo.getVehiculosComprados())) {
			result = true;;
		}
		return result;
	}

	//Metodo
	@Override
	public int compareTo(Cliente o) {
		return this.getNombre().compareTo(o.getNombre());
	}  
	
	//Metodo comprar
	public void comprarCoche (Vehiculo ve) {
		this.vehiculosComprados.add(ve);
	}
	
}
