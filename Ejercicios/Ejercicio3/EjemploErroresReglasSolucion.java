
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Annotation;

// PACKAGE = scr/main/java/packageName/YourCode.java

/**
 * Clase EjemploErroresReglas. Ejemplo 
 * 
 * @author Jesus 
 */
public class EjemploErroresReglas {

		/**
     * Constructor
     */
	public EjemploErroresReglas(){
		// The explicit constructor is here.
	}

	/**
     * Variable final privada
     */
	final String error = "ESTO ES UN ERROR";
	
	/**
     * Método main
     */
	public static void main(String[] args) {
		final String mostrarUsuario = "Hola mundo";
		System.out.println(mostrarUsuario);
		fecha();
	}
	
	private static void fecha () {
		final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse("11/12/2021");
    		System.out.println("Hoy es" + fechaDate);

        } 
        catch (ParseException ex) 
        {
        }
       
	}
}
