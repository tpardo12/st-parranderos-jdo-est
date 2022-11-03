

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Estante implements VOEstante
{
	
	private long id_estante;

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
	public Estante() 
    {
    	this.id_estante = 0;
		this.tipo = "";
		this.categoria = "";
		this.sucursal = "";
		this.capacidad = 0;
	}

    public Estante(long id_estante, String tipo, String categoria, String sucursal, int capacidad) 
    {
    	this.id_estante = id_estante;
		this.tipo = tipo;
		this.categoria = categoria;
		this.sucursal = sucursal;
		this.capacidad = capacidad;
	}

	public long getId_estante() {
		return this.id_estante;
	}

	public void setId_estante(long id_estante) {
		this.id_estante = id_estante;
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
		return "Bodega [id_bodega=" + id_estante + ", tipo=" + tipo + ", categoria=" + categoria + ", sucursal=" + sucursal
				+ ", capacidad=" + capacidad + "]";
	}
	

}
