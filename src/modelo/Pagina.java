package modelo;

public class Pagina {

	private long primer;
	private long ultimo;

	public Pagina(long primer, long ultimo) {
		super();
		this.primer = primer;
		this.ultimo = ultimo;
	}

	public long getPrimer() {
		return primer;
	}

	public long getUltimo() {
		return ultimo;
	}

}
