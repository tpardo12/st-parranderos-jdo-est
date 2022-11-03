/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar la relación GUSTAN del negocio de los Parranderos:
 * Cada objeto de esta clase representa el hecho que un bebedor gusta de una bebida y viceversa.
 * Se modela mediante los identificadores del bebedor y de la bebida respectivamente.
 * Debe existir un bebedor con el identificador dado
 * Debe existir una bebida con el identificador dado 
 * 
 * @author Germán Bravo
 */
public class Productos implements VOProductos
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que gusta de la bebida
	 */
	private long codigo;
	private String nombre;
	private int precio;
	private String presentacion;
	private int cantidad;
	private String unidadmedida;
	private float peso;
	private float volumen;
	private String cod_barras;
	private String categoria;

	

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Productos() 
	{
		this.codigo = 0;
		this.nombre = "";
		this.precio = 0;
		this.presentacion = "";
		this.cantidad = 0;
		this.unidadmedida = "";
		this.peso = 0;
		this.volumen = 0;
		this.cod_barras = "";
		this.categoria = "";
	}
	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadmedida() {
		return this.unidadmedida;
	}

	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVolumen() {
		return this.volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public String getCod_barras() {
		return this.cod_barras;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Constructor con valores
	 * @param idBebedor - El identificador del bebedor. Debe exixtir un bebedor con dicho identificador
	 * @param idBebida - El identificador de la bebida. Debe existir una bebida con dicho identificador
	 */


	
	@Override
	public String toString() 
	{
		return "Gustan [codigo=" + codigo + ", nombre=" + nombre +  ", precio=" + precio + ", presentacion=" + presentacion + 
		", cantidad=" + cantidad + ", unidadmedida=" + unidadmedida + ", peso=" + peso + ", volumen=" + volumen + ", cod_barras=" +
		cod_barras + 
		", categoria=" + categoria +
		"]";
	}
	
}
