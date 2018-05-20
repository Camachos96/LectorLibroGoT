package control;

import acciones.avanzar;
import acciones.irAMarca;
import acciones.marcar;
import acciones.retroceder;
import modelo.Libro;
import vista.LectorUI;

public class ParaUI extends LectorUI {
private Libro libro;
private avanzar avanzar;
private retroceder retroceder;
private marcar marcar;
private irAMarca irAMarca;

	private static final long serialVersionUID = 1L;
	public ParaUI() {
		libro = new Libro();
		avanzar = new avanzar(this);
		retroceder = new retroceder(this);
		marcar = new marcar(this);
		irAMarca = new irAMarca(this);
		asignarMAL();
		actualizarPagina();
	}
	
	public void actualizarPagina() {
		textArea.setText(this.libro.cargarTextoPaginaActual());
		lblPagina.setText(String.valueOf(this.libro.getActual()+1));
	}

	public Libro getLibro() {
		return libro;
	}
	
	private void asignarMAL() {
		this.BtnAvanzar.addActionListener(this.avanzar);
		this.BtnRetroceder.addActionListener(this.retroceder);
		this.Marcador.addActionListener(this.marcar);
		this.btnIrAlMarcapginas.addActionListener(this.irAMarca);
	}
	
	
}
