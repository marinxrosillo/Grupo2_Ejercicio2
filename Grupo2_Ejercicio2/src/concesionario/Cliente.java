package concesionario;

import java.util.ArrayList;

public class Cliente implements Comparable<Cliente> { 
	
	//Atributos
	private String nombre;
	private String direccion;
	ArrayList<Vehiculo> vehiculosComprados = new ArrayList<Vehiculo>();
	
	//Constructor
	public Cliente(String nombre, String direccion, ArrayList<Vehiculo> vehiculosComprados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.vehiculosComprados = vehiculosComprados;
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Vehiculo> getVehiculosComprados() {
		return vehiculosComprados;
	}

	public void setVehiculosComprados(ArrayList<Vehiculo> vehiculosComprados) {
		this.vehiculosComprados = vehiculosComprados;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + this.nombre + ", direccion=" + this.direccion + ", vehiculosComprados=" + this.vehiculosComprados
				+ "]";
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

	//Metodos
	@Override
	public int compareTo(Cliente o) {
		return this.getNombre().compareTo(o.getNombre());
	}  
	
}
