import java.util.ArrayList;
import java.util.List;

// PACKAGE = scr/main/java/packageName/YourCode.java

/**
 * Clase ArrayPrincipal. Ejemplo 
 * 
 * @author Jesus 
 */
public class ArrayPrincipal {

	/**
     * Método main
     */
	public static void main(String[] args) {
		
		final int[] arrayint = {};
		arrayint = new int[] {1, 2, 3, 4};
		final List<Integer> lista = new ArrayList<Integer>();
		lista.add(1); lista.add(2); lista.add(3); lista.add(4);
		
		int resultado = o.sumaArray(arrayint);
		try {
			resultado = o.restaArray(resultado*2, arrayint);
		} catch (ArithmeticException e) {
			e.logger();
		}
		
		int resultadoL = o.sumaList(l);
		try {
			resultadoL = o.restaList(resultado*2, l);
		} catch (ArithmeticException e) {
			e.logger();
		}
		
		if(resultado > resultadoL) {
			System.out.println("Array mayor");
		}
		else if (!(resultado > resultadoL)){
			System.out.println("Array no es mayor");
			if(resultadoL > resultado) {
				System.out.println("List es mayor");
			}
		}

	}

}
