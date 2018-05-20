package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.ParaUI;
import modelo.Legible;
import modelo.Libro;

class LegibleTest {
	ParaUI ParaUI = new ParaUI();
	Legible instancia = new Libro();
	
	@Before
	void setUp() throws Exception {
		instancia = new Libro();
	}

	@Test
	void testAvanzarPagina() {
		int paginaActual=((Libro)instancia).getActual();
		instancia.avanzarPagina();
		assertEquals(paginaActual+1, ((Libro)instancia).getActual());
	}

	@Test
	void testRetrocederPagina() {
		((Libro)instancia).avanzarPagina();
		int paginaActual = ((Libro)instancia).getActual();
		instancia.retrocederPagina();
		assertEquals(paginaActual-1, ((Libro)instancia).getActual());
	}

	@Test
	void testMarcarPagina() {
		int paginaMarcada=4;
		for (int i = 0; i < 11; i++) {
			if (i==paginaMarcada) {
				((Libro)instancia).marcarPagina();
			}
			((Libro)instancia).avanzarPagina();
		}
		assertEquals(paginaMarcada, ((Libro)instancia).getMarca());
		
	}

	@Test
	void testIrAPagina() {
		int paginaMarcada=4;
		for (int i = 0; i < 11; i++) {
			if (i==paginaMarcada) {
				((Libro)instancia).marcarPagina();
			}
			((Libro)instancia).avanzarPagina();
		}
		((Libro)instancia).irAPagina();
		assertEquals(paginaMarcada,((Libro)instancia).getActual());
	}

}
