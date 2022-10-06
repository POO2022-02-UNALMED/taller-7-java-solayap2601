package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		
	}
		
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina* getPaginas();
	}


	public String interpretacion() {
		return interpretacion;
	}


	public String toString() {
		String a= "";
		a += getOrigen() + "\n"
				+ getTitulo() + "\n"
				+ getAutor() + "\n"
				+ getPaginas() + "\n"
				+ ensenanza;	
		return a;
	}

	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
