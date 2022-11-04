

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Sucursal implements VOSucursal
{
	
	private long id_sucursal;

	private String ciudad;

	private String direccion;

	private long supermercado;

	private String nombre;



	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Sucursal() 
    {
    	this.id_sucursal = 0;
		this.ciudad = "";
		this.direccion = "";
		this.nombre = "";
		this.supermercado = 0;
	}

    public Sucursal(long id_sucursal, String ciudad, String direccion, String nombre, long supermercado) 
    {
    	this.id_sucursal = id_sucursal;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.nombre = nombre;
		this.supermercado = supermercado;
	}

	public long getId_sucursal() {
		return this.id_sucursal;
	}

	public void setId_sucursal(long id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getSupermercado() {
		return this.supermercado;
	}

	public void setSupermercado(long supermercado) {
		this.supermercado = supermercado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
   
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString() 
	{
		return "Sucursal [id_sucursal=" + id_sucursal + ", ciudad=" + ciudad + ", categoria=" + direccion + ", nombre=" + nombre
				+ ", supermercado=" + supermercado + "]";
	}
	

}
