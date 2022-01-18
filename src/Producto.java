
public class Producto implements Comparable<Producto>{
	String nombre;
	double ancho, alto, largo;

	public Producto(String nombre, double ancho, double alto, double largo) {
		super();
		this.nombre = nombre;
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double volumen() {
		double vol=alto*ancho*largo;
		return vol;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", ancho=" + ancho + "cm, alto=" + alto + "cm, largo=" + largo
				+ "cm, volumen()=" + volumen() + "cm3]";
	}


	@Override
	public int compareTo(Producto obj) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(obj.getNombre());
	}

}
