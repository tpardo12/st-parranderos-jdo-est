

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Bodega implements VOBodega
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private long id_bodega;

	private String tipo;

	private String categoria;

	private String sucursal;

	private float capacidad;

	

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Bodega() 
    {
    	this.id_bodega = 0;
		this.tipo = "";
		this.categoria = "";
		this.sucursal = "";
		this.capacidad = 0;
	}

    public Bodega(long id_bodega, String tipo, String categoria, String sucursal, int capacidad) 
    {
    	this.id_bodega = id_bodega;
		this.tipo = tipo;
		this.categoria = categoria;
		this.sucursal = sucursal;
		this.capacidad = capacidad;
	}

	public long getId_bodega() {
		return this.id_bodega;
	}

	public void setId_bodega(long id_bodega) {
		this.id_bodega = id_bodega;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public float getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

   
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString() 
	{
		return "Bodega [id_bodega=" + id_bodega + ", tipo=" + tipo + ", categoria=" + categoria + ", sucursal=" + sucursal
				+ ", capacidad=" + capacidad + "]";
	}
	

}
