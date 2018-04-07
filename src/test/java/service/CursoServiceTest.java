package service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import model.Estudiante;

public class CursoServiceTest {

	@Test
	public void obtenerMejorEstudianteTest_sinMock() {
		CursoService cursoService = new CursoService(new EstudianteServiceImpl());
		int mejorNota = cursoService.obtenerMejorEstudiante().getNota();
		assertEquals(15, mejorNota);
	}
	
	@Test
	public void obtenerMejorEstudianteTest_conMock() {
		EstudianteService miMock = mock(EstudianteService.class);
		List<Estudiante> todos = new ArrayList<>();
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Miguel");
		estudiante1.setNota(15);
		todos.add(estudiante1);
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Angel");
		estudiante2.setNota(14);
		todos.add(estudiante2);
		//Entonces no habría la necesidad de crear implementaciones para poder usar mi Servicio Estudiante
		when(miMock.todosLosEstudiantes()).thenReturn(todos);
		CursoService cursoService = new CursoService(miMock);
		int mejorNota = cursoService.obtenerMejorEstudiante().getNota();
		assertEquals(15, mejorNota);
	}
	
}

/* Tendría que implementar el Servicio Estudiante para devolver el metodo
* todosLosEstudiantes() ya que necesito el listado de estudiantes para 
* obtener la mejor calificación 
* */
 class EstudianteServiceImpl implements EstudianteService{

	@Override
	public List<Estudiante> todosLosEstudiantes() {
		List<Estudiante> todos = new ArrayList<>();
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Miguel");
		estudiante1.setNota(15);
		todos.add(estudiante1);
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Angel");
		estudiante2.setNota(14);
		todos.add(estudiante2);
		return todos;
	}
	 
 }