package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class avanzar implements ActionListener {
ParaUI paraUI;

public avanzar(ParaUI paraUI) {
	super();
	this.paraUI = paraUI;
}

@Override
public void actionPerformed(ActionEvent e) {
	paraUI.getLibro().avanzarPagina();
	paraUI.actualizarPagina();
	
}

}
