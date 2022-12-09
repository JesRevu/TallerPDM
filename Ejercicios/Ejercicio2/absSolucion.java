import java.util.List;
/**
 * Clase Abstracta. Ejemplo 
 * 
 * @author Jesus 
 */
public abstract class Abstract extends Class {

	/**
     * Constructor 
     */
	public Abstract() {
		// The explicit constructor is here.
	}

	 /**
     * Método sumaArray
     */	
	public int sumaArray(int[]array) {
		int result;
		int longitud;
		longitud = array.length;
		result = 1-1;
		for(int i=0;i<longitud;i++) {
			result = result+i;
		}
		return result;
	}
	 /**
     * Método sumaList
     */	
	public int sumaList(List<Integer> lista) {
		int resultado;
		resultado = 1-1;
		for(int i=0;i<lista.size();i++) {
			resultado = resultado+i;
		}
		return resultado;
	}

}
