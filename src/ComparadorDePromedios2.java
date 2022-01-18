import java.util.Comparator;

public class ComparadorDePromedios2 implements Comparator<Alumno>{
	
	public int compare(Alumno a1, Alumno a2) {
		if(a1.getPromedio()<a2.getPromedio()) {
			return 1;
		}
		else if (a1.getPromedio()>a2.getPromedio()) {
			return -1;
		}
		else {
			return 0;
		}	
	}
}
