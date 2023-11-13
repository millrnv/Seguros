public class Empresa {

	private String nombre;
	private String direccion;
	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
	private List<Seguro> seguros;

	/**
	 * 
	 * @param cliente
	 */
	public void agregarCliente(Cliente cliente) {
		// TODO - implement Empresa.agregarCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vendedor
	 */
	public void agregarVendedor(Vendedor vendedor) {
		// TODO - implement Empresa.agregarVendedor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rut
	 */
	public Cliente buscarCliente(String rut) {
		// TODO - implement Empresa.buscarCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vendedor
	 */
	public void despedirVendedor(Vendedor vendedor) {
		// TODO - implement Empresa.despedirVendedor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cliente
	 * @param vendedor
	 */
	public void asegurarCliente(Cliente cliente, Vendedor vendedor) {
		// TODO - implement Empresa.asegurarCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param edad
	 */
	public List<Cliente> buscarClientesTerceraEdad(String edad) {
		// TODO - implement Empresa.buscarClientesTerceraEdad
		throw new UnsupportedOperationException();
	}

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
	 * @param cliente
	 */
	public boolean clienteExiste(Cliente cliente) {
		// TODO - implement Empresa.clienteExiste
		throw new UnsupportedOperationException();
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	/**
	 * 
	 * @param clientes
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Vendedor> getVendedores() {
		return this.vendedores;
	}

	/**
	 * 
	 * @param vendedores
	 */
	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<Seguro> getSeguros() {
		return this.seguros;
	}

	/**
	 * 
	 * @param seguros
	 */
	public void setSeguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}

	/**
	 * 
	 * @param vendedor
	 */
	public boolean vendedorExiste(Vendedor vendedor) {
		// TODO - implement Empresa.vendedorExiste
		throw new UnsupportedOperationException();
	}

}