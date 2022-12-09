import java.util.ArrayList;
import java.util.List;

// PACKAGE = scr/main/java/packageName/YourCode.java

/**
 * Clase Principal. Ejemplo 
 * 
 * @author Jesus 
 */
public class Principal {

	/**
     * Constructor
     */
	public principal(){
		// The explicit constructor is here.
	}
	
	
	 /**
     * Variable privado
     */
	double privado;

	 /**
     * Método main
     */
	public static void main(String[] args) {
		
		Double sumafor = 0.0;
		final List<Double> lista = new ArrayList<Double>();
		final Double numeroRandom = Math.floor(Math.random()*(1-100+1)+1);
		
		for (int i = 0; i < 90; i++) {
			lista.add(i*numeroRandom);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			sumafor = sumafor + i;
		}
		
		System.out.println(resultado(lista));
		
		

	}
	
	private static String resultado(List<Double> list) {
		double count = 0;
		String resultado;
		
		for (int i = 0; i < list.size(); i++) {
			count = count + i;
			}
		if (c > 10) {
			if (count % 2 == 0) {
				resultado = "Me gusta este resultado";
			}
			else {
				resultado = "No me gusta este resultado";
			}
		}
		else {
			resultado =  "No me gusta este resultado";
		}

		return resultado;
	}

}
