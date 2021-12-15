package es.iestriana.poo.main;

import es.iestriana.poo.bean.Canciones;
import es.iestriana.poo.dao.MusicalDAO;
import es.iestriana.poo.dao.MusicalDAOListas;

public class Principal {

	public static void main(String[] args) {
		MusicalDAO lista = new MusicalDAOListas();

		Canciones c1 = new Canciones("nombre","interprete", 90, "rock", 1980);
		Canciones c2 = new Canciones("pepe","juan", 100, "jazz", 2000);

		lista.nuevaCancion(c1);
		lista.nuevaCancion(c2);
		lista.modificarCalificacion(c2, 3);
		lista.modificarCalificacion(c1, 5);
		lista.calificacionMedia();
		lista.duracionTotal();

	

	}

}
