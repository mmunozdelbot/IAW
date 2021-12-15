package es.iestriana.poo.bean;

import java.io.Serializable;

public class Canciones implements Serializable {
	
	private String nombre;
	private String interprete;
	private int ano;
	private String genero;
	private int duracion;
	private int NumeroDeReproducciones;
	private int calificacion;
	private boolean reproducir;
	
	private void canciones() {
		// TODO Auto-generated method stub

	}

	

	public Canciones(String nombre, String interprete, int ano, String genero, int duracion) {
		super();
		this.nombre = nombre;
		this.interprete = interprete;
		this.ano = ano;
		this.genero = genero;
		this.duracion = duracion;
		NumeroDeReproducciones = 0;
		calificacion = 0;
		reproducir = true;
	}





	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getInterprete() {
		return interprete;
	}



	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public int getNumeroDeReproducciones() {
		return NumeroDeReproducciones;
	}



	public void setNumeroDeReproducciones(int numeroDeReproducciones) {
		NumeroDeReproducciones = numeroDeReproducciones;
	}



	public int getCalificacion() {
		return calificacion;
	}



	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}



	public boolean isReproducir() {
		return reproducir;
	}



	public void setReproducir(boolean reproducir) {
		this.reproducir = reproducir;
	}



	@Override
	public String toString() {
		return "Canciones [nombre=" + nombre + ", interprete=" + interprete + ", ano=" + ano + ", genero=" + genero
				+ ", duracion=" + duracion + ", NumeroDeReproducciones=" + NumeroDeReproducciones + ", calificacion="
				+ calificacion + ", reproducir=" + reproducir + "]";
	}
	
	
	

	


	
}
