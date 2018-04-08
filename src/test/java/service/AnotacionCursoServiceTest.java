package service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import model.Estudiante;

@RunWith(MockitoJUnitRunner.class)
public class AnotacionCursoServiceTest {
	
	@Mock
	EstudianteService miMock;
	
	@InjectMocks
	CursoService cursoService;
	
	@Test
	public void obtenerMejorEstudianteTest() {
		List<Estudiante> todos = new ArrayList<>();
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Miguel");
		estudiante1.setNota(15);
		todos.add(estudiante1);
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Angel");
		estudiante2.setNota(14);
		todos.add(estudiante2);
		
		when(miMock.todosLosEstudiantes()).thenReturn(todos);
		
		//con @InjectMocks no hay necesidad de injectarle una instancia EstudianteService
		int mejorNota = cursoService.obtenerMejorEstudiante().getNota();
		assertEquals(15, mejorNota);

	}
}
