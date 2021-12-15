package es.iestriana.poo.dao;

import es.iestriana.poo.bean.Canciones;

public interface MusicalDAO {

	
	public void nuevaCancion(Canciones c);
	public void mostrarTodas();
	public void borrarCancion(Canciones c);
	public void cancionAno(int ano);
	public void cancionGenero(String genero);
	public void cancionInterprete(String interprete);
	public void modificarCalificacion(Canciones c,int calificacion);
	public void buscarDuracion(int p, int f);
	public void duracionTotal();
	public void calificacionMedia();
	public void cancionNombre(String nombre);
	public void borrarTodas();
	
}
