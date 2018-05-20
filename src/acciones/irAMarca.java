package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class irAMarca implements ActionListener{
private ParaUI paraUI;

public irAMarca(ParaUI paraUI) {
	super();
	this.paraUI = paraUI;
}

@Override
	public void actionPerformed(ActionEvent e) {
	paraUI.getLibro().irAPagina();
	paraUI.actualizarPagina();
	}
}
