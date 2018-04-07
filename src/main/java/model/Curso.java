package model;

import java.util.List;

public class Curso {
	private String nombre;
	private List<Estudiante> alumnos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Estudiante> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Estudiante> alumnos) {
		this.alumnos = alumnos;
	}
	
}
