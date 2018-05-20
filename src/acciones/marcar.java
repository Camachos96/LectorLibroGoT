package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class marcar implements ActionListener {
private ParaUI paraUI;

public marcar(ParaUI paraUI) {
	super();
	this.paraUI = paraUI;
}

@Override
public void actionPerformed(ActionEvent e) {
	paraUI.getLibro().marcarPagina();
	
}
	
}
