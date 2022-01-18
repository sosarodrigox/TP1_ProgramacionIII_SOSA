import java.util.Comparator;

public class ComparadorEdades implements Comparator<Profesor>{

	public int compare(Profesor p1, Profesor p2) {
		if(p1.getEdad()<p2.getEdad()) {
			return -1;
		}
		else if (p1.getEdad()>p2.getEdad()) {
			return 1;
		}
		else {
			return 0;
		}	
	}
}
