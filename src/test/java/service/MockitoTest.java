package service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {

	@Test
	public void tamanioTest() {
		List miMock = mock(List.class);
		when(miMock.size()).thenReturn(10);
		assertEquals(10, miMock.size());
		assertEquals(10, miMock.size());
	}
	
	@Test
	public void multipleValores() {
		List miMock = mock(List.class);
		when(miMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, miMock.size());
		assertEquals(20, miMock.size());
		assertEquals(20, miMock.size());
	}
	
	@Test
	public void unValorEspecifico() {
		List miMock = mock(List.class);
		when(miMock.get(0)).thenReturn("Alguna cadena");
		assertEquals("Alguna cadena", miMock.get(0));
		assertEquals(null, miMock.get(1));
	}
	
	@Test
	public void devolverUnValorGenerico() {
		List miMock = mock(List.class);
		when(miMock.get(Mockito.anyInt())).thenReturn("Alguna cadena");
		assertEquals("Alguna cadena", miMock.get(0));
		assertEquals("Alguna cadena", miMock.get(1));
	}
}
