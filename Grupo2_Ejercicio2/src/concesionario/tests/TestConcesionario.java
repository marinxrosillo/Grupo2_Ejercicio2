package concesionario.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import concesionario.clases.Camion;
import concesionario.clases.Cliente;
import concesionario.clases.Coche;
import concesionario.clases.Concesionario;
import concesionario.clases.Vehiculo;

public class TestConcesionario {

	public static void main(String[] args) {
		
		Set<Vehiculo> inventarioVehiculos = new TreeSet<Vehiculo>();
		
		Concesionario concesionario = new Concesionario(inventarioVehiculos);
		
		Vehiculo vehiculo1 = new Vehiculo("Ford", "Focus", "2003", 750);
		Vehiculo vehiculo2 = new Vehiculo("Nissan", "Micra", "2019", 13000);
		Vehiculo vehiculo3 = new Vehiculo("Mercedes", "ClaseA", "2022", 45000);
		
		Vehiculo vehiculo4 = new Camion("Volvo", "FH", "2010", 7000, 60);
		
		Vehiculo vehiculo5 = new Coche("Skoda", "Fabia", "2018", 9000, "Berlina", 5);
		
		inventarioVehiculos.add(vehiculo1);
		inventarioVehiculos.add(vehiculo2);
		inventarioVehiculos.add(vehiculo3);
		inventarioVehiculos.add(vehiculo4);
		inventarioVehiculos.add(vehiculo5);
		
		List<Vehiculo> vehiculosComprados = new ArrayList<Vehiculo>();
		
		Cliente cliente = new Cliente("Vladi", "El Viso del Alcor");
		
		for(Vehiculo vehiculo : inventarioVehiculos) {
			System.out.println(vehiculo);
		}
		
		concesionario.vender(vehiculo1, cliente);
		
		
		System.out.println(vehiculo1.toString());
	}
}