package concesionario.comparadores;

import java.util.Comparator;
import concesionario.clases.Vehiculo;

public class ComparadorPrecio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getPrecio() - o2.getPrecio();
	}

}