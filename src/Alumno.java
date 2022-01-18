
public class Alumno extends Persona {
	
	int nroLE, materiasAprobadas;
	double promedio;
	
	public Alumno() {};

	public Alumno(String apellido, String nombre, long dni, int nroLE, int materiasAprobadas, double promedio) {
		
		super.apellido=apellido;
		super.nombre=nombre;
		super.dni=dni;
		this.nroLE=nroLE;
		this.materiasAprobadas=materiasAprobadas;
		this.promedio=promedio;
	}
	
	public int getNroLE() {
		return nroLE;
	}

	public void setNroLE(int nroLE) {
		this.nroLE = nroLE;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Alumno: " + apellido + ", " + nombre + " - Promedio: "+promedio;
	}
}
