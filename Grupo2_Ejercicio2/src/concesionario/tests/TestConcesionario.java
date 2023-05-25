package concesionario.tests;

import concesionario.clases.*;

public class TestConcesionario {

	public static void main(String[] args) {
		
		Concesionario concesionario = new Concesionario();
		
		Vehiculo vehiculo1 = new Vehiculo("Ford", "Focus", "2003", 750);
		Vehiculo vehiculo2 = new Vehiculo("Nissan", "Micra", "2019", 13000);
		Vehiculo vehiculo3 = new Vehiculo("Mercedes", "ClaseA", "2022", 45000);
		
		Vehiculo vehiculo4 = new Camion("Volvo", "FH", "2010", 7000, 60);
		
		Vehiculo vehiculo5 = new Coche("Skoda", "Fabia", "2018", 9000, "Berlina", 5);
		
		Coche coche1 = new Coche("Audi", "A1", "2018", 9000, "Berlina", 5);
		
		concesionario.agregarVehiculo(vehiculo1);
		concesionario.agregarVehiculo(vehiculo2);
		concesionario.agregarVehiculo(vehiculo3);
		concesionario.agregarVehiculo(vehiculo4);
		concesionario.agregarVehiculo(vehiculo5);
		concesionario.agregarVehiculo(coche1);
		
		System.out.println("MOSTRAMOS LOS VEHICULOS ORDENADOS POR PRECIO: ");
		concesionario.mostrarVehiculosOrdenadosPrecio();
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("MOSTRAMOS EL VEHICULO MÁS BARATO Y EL MÁS CARO: ");
		concesionario.mostrarVehiculosCaroBarato();
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		Cliente cliente = new Cliente("Vladi", "El Viso del Alcor");
		
		System.out.println("VENDEMOS VEHICULOS: ");
		concesionario.vender(vehiculo1, cliente);
		concesionario.vender(coche1, cliente);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("MOSTRAMOS LA LISTA DE VEHICULOS DISPONIBLES: ");
		concesionario.mostrarVehiculosOrdenadosPrecio();
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("ENTREGAMOS VEHICULOS: ");
		coche1.entregar(cliente);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
//		System.out.println("BUSCAMOS VEHICULOS CON FILTROS: ");
//		concesionario.buscarPorMarca("Nissan");
//		concesionario.buscarPorModelo("Focus");
//		concesionario.buscarPorAnyo("2022");
//		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("BUSCAMOS VEHICULOS POR MARCA, MODELO Y AÑO: ");
		concesionario.buscarGeneral("Nissan", "Micra", "2019");
	}
}