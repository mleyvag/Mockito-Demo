package service;

import java.util.List;

import model.Estudiante;

public class CursoService {
	
	private EstudianteService alumnoService;

	public CursoService(EstudianteService alumnoService) {
		super();
		this.alumnoService = alumnoService;
	}
	
	public Estudiante obtenerMejorEstudiante() {
		List<Estudiante> todos = alumnoService.todosLosEstudiantes();		
		
		Estudiante mejorEstudiante = new Estudiante();
		mejorEstudiante.setNota(Integer.MIN_VALUE);		
		
		for (Estudiante miEstudiante : 	todos) {
			if ( miEstudiante.getNota() > mejorEstudiante.getNota()) {				
				mejorEstudiante = miEstudiante;
			}
		}
		return mejorEstudiante;
	}
	
}
