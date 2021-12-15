package es.iestriana.poo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.iestriana.poo.bean.Canciones;

public class MusicalDAOListas implements MusicalDAO{

	
	
	private List<Canciones> lista_de_canciones = new ArrayList<Canciones>();
	
	
	@Override
	public void nuevaCancion(Canciones c) {
		lista_de_canciones.add(c);
		
	}

	@Override
	public void mostrarTodas() {
		for (Canciones canciones : lista_de_canciones) {
			System.out.println(canciones);
		}
		
		
	}

	@Override
	public void borrarTodas() {
		lista_de_canciones.removeAll(lista_de_canciones);
		
	}

	@Override
	public void borrarCancion(Canciones c) {
		lista_de_canciones.remove(c);
		
	}

	@Override
	public void cancionAno(int ano) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getAno() == ano) {
				System.out.println(lista_de_canciones.get(i));
			}
		}
		
		
	}

	@Override
	public void cancionGenero(String genero) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getGenero() == genero);
			System.out.println(lista_de_canciones.get(i));
		}
			}

	@Override
	public void cancionInterprete(String interprete) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getInterprete() == interprete);
			System.out.println(lista_de_canciones.get(i));
		}
		
	}

	@Override
	public void cancionNombre(String nombre) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getNombre() == nombre);
			System.out.println(lista_de_canciones.get(i));
		}
	}

	@Override
	public void modificarCalificacion(Canciones c, int calificacion) {
		if(calificacion >=0 && calificacion <6) {
			c.setCalificacion(calificacion);
			System.out.println("la calificacion de la cancion " + c + "es ");
		}else {
			System.out.println("La calificacion es incorrecta");
		}
	}



	@Override
	public void duracionTotal() {
		int duracionTotal = 0; 
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			duracionTotal += lista_de_canciones.get(i).getDuracion(); 
		}
		System.out.println("La duración total de la lista es: "+duracionTotal);
		
	}

	@Override
	public void calificacionMedia() {

		double calificacionTotal = 0;
		double contador = 0;
		for (int i = 0; i < lista_de_canciones.size(); i++) {
		contador++;
		calificacionTotal += lista_de_canciones.get(i).getCalificacion(); 
		}
		double calificacionMedia = calificacionTotal/contador;
		System.out.println("La claificación media de la lista es: "+calificacionMedia);
	}

	@Override
	public void buscarDuracion(int p, int f) {
		for (Canciones cancion : lista_de_canciones) {
			if (cancion.getDuracion()>=p && cancion.getDuracion()<=f) {
				System.out.println(cancion);
			}

		}



	
	
	
	
	}
}
