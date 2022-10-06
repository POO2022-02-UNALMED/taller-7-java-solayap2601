package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		String a = "";
		for (int i = 0; i< letras.length-1; i++) {
			a += letras[i] + ", ";
		}
		a += letras[letras.length - 1];
		return a;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String[] getLetras() {
		return this.letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String getInterpretacion() {
		return this.interpretacion;
	}
}
