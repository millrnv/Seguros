import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private String direccion;
	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
	private List<Seguro> seguros;



	public Empresa(String nombre, String direccion){

		nombre = this.nombre;
		direccion = this.direccion;
		this.clientes = new ArrayList<>();
		this.vendedores = new ArrayList<>();
		this.seguros = new ArrayList<>();


	}

	public void agregarCliente(Cliente cliente) {
		if (!clienteExiste(cliente)) {
			this.clientes.add(cliente);
		} else {
			throw new UnsupportedOperationException("El cliente ya existe.");
		}
	}


	public void agregarVendedor(Vendedor vendedor) {
		if (!vendedorExiste(vendedor)) {
			this.vendedores.add(vendedores);
		} else {
			throw new UnsupportedOperationException("El vendedor ya existe.");
		}
	}


	public Cliente buscarCliente(String rut) {

		for (Cliente cliente : this.clientes) {
			if (cliente.getRut().equals(rut))
				return cliente;
		}

		System.out.println("El cliente no existe");
		return null;
	}


	public void despedirVendedor(Vendedor vendedor) {
		// TODO - implement Empresa.despedirVendedor
		throw new UnsupportedOperationException();
	}


	public void asegurarCliente(Cliente cliente, Vendedor vendedor) {
		if (!clienteExiste(cliente)) {
			System.out.println("El cliente no se encuentra en nuestra empresa");
			return;
		}
		for (Seguro seguro : seguros) {
			if (seguro.getCliente().equals(cliente)) {
				System.out.println("El cliente ya está asegurado");
				return;
			}
		}
		Seguro nuevoSeguro = new Seguro(cliente, vendedor);
		seguros.add(nuevoSeguro);
	}


	public List<Cliente> buscarClientesTerceraEdad(String edad) {

		List<Cliente> clientesTerceraEdad = new Arraylist<>();

		for(Cliente c : clientes){
			if(c.getEdad(edad) >= 65){
				clientesTerceraEdad.add(c);
			}
		}

		return clientesTerceraEdad;
	}



		// TODO - implement Empresa.buscarClientesTerceraEdad
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public boolean clienteExiste(Cliente cliente) {

		for (Cliente c : this.clientes) {
			if (cliente.getRut().equals(c.getRut())) {
				return true;
			}
		}
		throw new UnsupportedOperationException("El cliente no existe.");
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Vendedor> getVendedores() {
		return this.vendedores;
	}


	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<Seguro> getSeguros() {
		return this.seguros;
	}


	public void setSeguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}


	public boolean vendedorExiste(Vendedor vendedor) {
		for (Vendedor v : this.vendedores) {
			if (vendedor.getID().equals(v.getID())) {
				return true;
			}
		}
		throw new UnsupportedOperationException("El vendedor no existe.");
	}


}