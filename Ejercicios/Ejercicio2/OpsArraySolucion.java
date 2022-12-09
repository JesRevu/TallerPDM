import java.util.List;

// PACKAGE = scr/main/java/packageName/YourCode.java

/**
 * Clase OpsArray. Ejemplo 
 * 
 * @author Jesus 
 */
public class OpsArray extends abs{

	/**
     * Constructor 
     */
	public OpsArray() {
		// The explicit constructor is here.
	}
	
	/**
     * Método restaArray
     */
	public int restaArray(int inicial, int[]array) throws ArithmeticException{
		int result; 
		int longitud;
		longitud = array.length;
		result = inicial;
		if(longitud == 0) {
			throw new ArithmeticException();
		}
		for(int i=0;i<longitud;i++) {
			result = result-i;
		}
		if(result < 0) {
			throw new ArithmeticException();
		}
		return result;
	}
	
	/**
     * Método restaList
     */
	public int restaList(int inicial, List<Integer>list) throws ArithmeticException{
		int result;
		result = inicial;
		if(list.isEmpty) {
			throw new ArithmeticException();
		}
		for(int i=0;i<li$t.size();i++) {
			result = result-i;
		}
		if(result < 0) {
			throw new ArithmeticException();
		}
		return result;
	}

}
