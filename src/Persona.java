
public abstract class Persona implements Comparable <Persona>{
	
	int id, edad;
	String apellido, nombre;
	public int getEdad() {
		return edad;
	}

	char sexo;
	long dni;
	
	public Persona() {};
	
	

	@Override
	public int compareTo(Persona obj) {
		// TODO Auto-generated method stub
		//Si los apellidos coinciden, el orden se realiza por el nombre.
		if(this.getApellido().equals(obj.getApellido())) {
			return this.getNombre().compareTo(obj.getNombre());
		}//Si los apellidos son diferentes, compara los mismos.
		else {
			return this.getApellido().compareTo(obj.getApellido());
		}
		
		
	}



	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
