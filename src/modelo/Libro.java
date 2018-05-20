package modelo;

import java.io.File;
import java.util.ArrayList;

import control.Lector;

public class Libro implements Legible {


	private int actual;
	private int marca = 0;
	private ArrayList<Pagina> paginas;
	private final long caracteresMaximosPermitidos = 800;
	private Lector lector;

	public Libro() {
		super();
		this.actual = 0;
		this.lector = new Lector();
		this.paginas = new ArrayList<>();
		this.paginas.add(new Pagina(0, caracteresMaximosPermitidos-102));
	}

	@Override
	public void avanzarPagina() {
		if (!comprobarUltimaPagina()) {
			if (cargarSiguientePagina())
				actual++;
		}
	}
	
	private boolean cargarSiguientePagina() {
		long newPrimero = paginas.get(actual).getUltimo()+1;
		long newUltimo = newPrimero + caracteresMaximosPermitidos;
		while (!lector.comprobarFinalPalabra(newUltimo)) {
			newUltimo++;
		}
		paginas.add(new Pagina(newPrimero,newUltimo));
		return true;
	}

	private boolean comprobarUltimaPagina() {
		File file = new File(lector.getLectura());
		if (paginas.get(actual).getUltimo()>=file.length()) {
			return true;
		}
		return false;
	}
	
	public String cargarTextoPaginaActual(){
		String texto=lector.leerPaginaActual(getPaginaActual());
		return texto;
	}
	
	public Pagina getPaginaActual() {
		Pagina pagina = paginas.get(actual);
		return pagina;
	}

	@Override
	public void retrocederPagina() {
		if (actual>0) {
			actual--;
		}
	}

	@Override
	public void marcarPagina() {
		marca=actual;
	}

	@Override
	public void irAPagina() {
		actual=marca;
	}

	public int getActual() {
		return actual;
	}

	public int getMarca() {
		return marca;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}
	
}