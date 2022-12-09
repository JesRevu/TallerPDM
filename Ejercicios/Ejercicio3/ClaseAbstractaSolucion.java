package errores;

import java.util.List;
/**
 * Clase Abstracta. Ejemplo 
 * 
 * @author Jesus 
 */
abstract class ClaseAbstracta extends Class{

	/**
     * Constructor 
     */
	public ClaseAbstracta(String nombre, String apellido) {
		// The explicit constructor is here.

	 /**
     * Variable nombre 
     */
	private String nombre;
	 /**
     * Variable apellid 
     */
	private String apellido;
	 /**
     * Lista 
     */	
	private List<ClaseAbstracta> amigos;

	 /**
     * Método anhadirAmigo
     */
	public void anhadirAmigo (ClaseAbstracta amigo) {
		amigos.add(amigo);
	}
	 /**
     * Método debvuelve amigo
     */
	public boolean devuelveAmigoNombre (String nombre) {
		int amigoNum = 0;
		boolean resultado = false;
		for(final Amigo amigo : amigos){
			if (amigo.getNombre.equals(nombre)) {
				amigoNum= amigoNum + 1;
				resultado = true;
			}
		}
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<ClaseAbstracta> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<ClaseAbstracta> amigos) {
		this.amigos = amigos;
	}



}
