
public class Profesor extends Persona{

	int legajo;
	String titulo;
	
	public Profesor(String apellido, String nombre, long dni, int legajo, String titulo, int edad) {
	
		super.apellido=apellido;
		super.nombre=nombre;
		super.dni=dni;
		super.edad=edad;
		this.legajo=legajo;
		this.titulo=titulo;
		
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Profesor: "+ apellido + ", " + nombre + " ("+titulo+")"+" Edad: "+edad;
	}
}
