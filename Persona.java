public class Persona {

	protected String nombre;
	protected String rut;
	protected String direccion;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @param nombre
	 * @param rut
	 * @param direccion
	 */
	public Persona(String nombre, String rut, String direccion) {
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param direccion
	 */
	public void modificarDireccion(String direccion) {
		// TODO - implement Persona.modificarDireccion
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Persona.toString
		throw new UnsupportedOperationException();
	}

}