import java.util.*;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. Analice el ejemplo dado en la siguiente página. https://www.tutorialspoint.com/java/java_using_comparator.htm
		 2. Implemente la clase Persona(id, apellido, nombre, edad, sexo, dni), 
		 y las subclases Alumno(nroLE, materiasAprobadas, promedio) 
		 y Profesor(legajo, titulo).
		 Armar una lista de 20 Personas entre Alumnos y Profesores.
		*/
		
		List<Persona> listaPersonas=new ArrayList<Persona>();
		List<Alumno> listaAlumnos=new ArrayList<Alumno>();
		List<Profesor> listaProfesores=new ArrayList<Profesor>();
		
		Alumno alumno1=new Alumno("Pérez","Juan",52854965,845,12,8.5);
		listaPersonas.add(alumno1);
		Alumno alumno2=new Alumno("González","Rodrigo",45845321,525,2,6.3);
		listaPersonas.add(alumno2);
		Alumno alumno3=new Alumno("Urritia","Alejandro",78965412,567,22,8.2);
		listaPersonas.add(alumno3);
		Alumno alumno4=new Alumno("Godoy","Domingo",84789578,277,14,1.9);
		listaPersonas.add(alumno4);
		Alumno alumno5=new Alumno("Gómez","Laura",12332254,785,17,5.6);
		listaPersonas.add(alumno5);
		Alumno alumno6=new Alumno("Montaña","Martín",54159754,147,14,6.4);
		listaPersonas.add(alumno6);
		Alumno alumno7=new Alumno("Ríos","Morena",63678814,100,11,10.0);
		listaPersonas.add(alumno7);
		Alumno alumno8=new Alumno("Montaña","Jessica",12356987,178,10,9.8);
		listaPersonas.add(alumno8);
		Alumno alumno9=new Alumno("De Santiago","Gonzalo",35183597,014,5,8.6);
		listaPersonas.add(alumno9);
		Alumno alumno10=new Alumno("Mesa","Vanessa",31698333,789,12,9.3);
		listaPersonas.add(alumno10);
		Alumno alumno11=new Alumno("Taborda","Stefania",24286597,855,10,5.6);
		listaPersonas.add(alumno11);
		Alumno alumno12=new Alumno("Londero","Miriam",46177486,414,23,6.23);
		listaPersonas.add(alumno12);
		Alumno alumno13=new Alumno("Arapeiz","José",85965887,471,30,9.5);
		listaPersonas.add(alumno13);
		Alumno alumno14=new Alumno("Vespa","Arturo",63379156,854,18,8.2);
		listaPersonas.add(alumno14);
		Alumno alumno15=new Alumno("Gutierrez","María Clara",85000000,746,14,9.3);
		listaPersonas.add(alumno15);
		Profesor profesor1 = new Profesor("Gómez","Osvaldo",31017209,323,"Ingeniero",23);
		listaPersonas.add(profesor1);
		Profesor profesor2 = new Profesor("Cervín","Valentina",32587963,856,"Doctor",55);
		listaPersonas.add(profesor2);
		Profesor profesor3 = new Profesor("Cervín","Magdalena",25698745,124,"Ing. en Sistemas",28);
		listaPersonas.add(profesor3);
		Profesor profesor4 = new Profesor("Bilche","Mauro",8963587,227,"Técnico",36);
		listaPersonas.add(profesor4);
		Profesor profesor5 = new Profesor("Ortelli","Guillermo",27965888,986,"Contador",37);
		listaPersonas.add(profesor5);
		
		//Muestra la lista completa:
		System.out.println("Lista completa:");
		for(Persona listado:listaPersonas) {
			System.out.println(listado.toString());
		}
		
		//Divide la lista:
		
		for(int i=0;i<listaPersonas.size();i++){
			if(listaPersonas.get(i) instanceof Alumno) {
				listaAlumnos.add((Alumno)listaPersonas.get(i));
			}
			else {
				listaProfesores.add((Profesor)listaPersonas.get(i));
			}
		}
		
		//a. Ordenar los Alumnos por Apellido y Nombre.
		System.out.println("");
		System.out.println("Lista de alumnos ordenada por apellido y nombre:");
		Collections.sort(listaAlumnos);
		for(Alumno listA:listaAlumnos) {
			System.out.println(listA.toString());
		}
		
		System.out.println("");
		//b. Ordenar los Profesores por Apellido y Nombre.
		System.out.println("Lista de profesores ordenada por apellido y nombre:");
		Collections.sort(listaProfesores);
		for(Profesor listP:listaProfesores) {
			System.out.println(listP.toString());
		}
		
		//c. Identificar el mayor promedio de toda la lista completa.
		System.out.println("");
		System.out.println("Mayor y menor promedio:");
		//Ordeno los alumnos según el promedio:
		Collections.sort(listaAlumnos, new ComparadorDePromedios());
		//Muestro el mayor promedio.
		System.out.println("El menor promedio es: "+listaAlumnos.get(0));
		
		//d. Identificar el menor promedio de toda la lista completa.
		System.out.println("El mayor promedio es: "+listaAlumnos.get((listaAlumnos.size())-1));
		
		//e. Identificar los alumnos que tienen un promedio mayor a 7, y esa lista ordenada por mayor promedio.
		System.out.println("");
		System.out.println("Promedios mayores a 7.0:");
		//Primero los ordena de mayor a menor:
		Collections.sort(listaAlumnos, new ComparadorDePromedios2());
		//Muestra los promedios mayores a 7.
		for(int i=0;i<listaAlumnos.size();i++) {
			if(listaAlumnos.get(i).promedio>=7.0) {
				System.out.println(listaAlumnos.get(i));
			}
		}
		
		//f. Identificar los profesores cuyo título sea “Ing. en Sistemas”
		System.out.println("");
		for(int i=0;i<listaProfesores.size();i++) {
			if(listaProfesores.get(i).titulo.equalsIgnoreCase("ing. en sistemas")) {
				System.out.println("El/La profesor/a "+listaProfesores.get(i).nombre+" "+listaProfesores.get(i).apellido+ " es Ingeniero/a en Sistemas.");
			}
		}
		System.out.println("");
		System.out.println("Profesores ordenados por edad:");
		//g. Ordenar los profesores de Mayor a Menor, imprimiendo sus datos por pantalla.
		Collections.sort(listaProfesores, new ComparadorEdades());
		for(Profesor profe:listaProfesores) {
			System.out.println(profe);
		}
			
	}
}
