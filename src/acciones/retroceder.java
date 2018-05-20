package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import control.ParaUI;

public class retroceder implements ActionListener{
ParaUI paraUI;

public retroceder(ParaUI paraUI) {
	super();
	this.paraUI = paraUI;
}

@Override
public void actionPerformed(ActionEvent e) {
	paraUI.getLibro().retrocederPagina();
	paraUI.actualizarPagina();
	
}

}
