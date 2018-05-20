package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.Pagina;

public class Lector {
	private String lectura;
	final int caracterEspacio = 32;
	File file;
	FileInputStream input;
	InputStreamReader reader;

	
	
public Lector() {
		super();
		this.lectura = "JuegoTronos.txt";
	}

public boolean comprobarFinalPalabra(long l) {
	try {
		file = new File(lectura);
		input = new FileInputStream(file);
		reader = new InputStreamReader(input,"utf-8");
		reader.skip(l);
		if (reader.read()==caracterEspacio) {
			return true;
		}
		reader.close();
		input.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

public String leerPaginaActual(Pagina pagina) {
	int caracter=0;
	StringBuilder texto = new StringBuilder();
	try {
		file = new File(lectura);
		input = new FileInputStream(file);
		reader = new InputStreamReader(input,"utf-8");
		reader.skip(pagina.getPrimer());
		for (int i = (int) pagina.getPrimer(); i < (int) pagina.getUltimo(); i++) {
			caracter = reader.read();
			char letra = (char) caracter;
			texto.append(letra);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return texto.toString();
}

public String getLectura() {
	return lectura;
}

}
