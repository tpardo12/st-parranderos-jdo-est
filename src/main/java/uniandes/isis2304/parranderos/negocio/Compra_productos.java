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
 * Clase para modelar el concepto BEBIDA del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Compra_productos implements VOCompra_productos
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private int cantidad;

	private long codigo_producto;

	private long id_compra;

	

	
	
	
	public Compra_productos() 
	{
		this.cantidad = 0;
		this.codigo_producto = 0;
		this.id_compra = 0;
		
	}


	public Compra_productos(int cantidad, long codigo_producto,long id_compra ) 
	{
		this.cantidad = cantidad;
		this.codigo_producto = codigo_producto;
		this.id_compra = id_compra;
		
	}
	
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getCodigo_producto() {
		return this.codigo_producto;
	}

	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public long getId_compra() {
		return this.id_compra;
	}

	public void setId_compra(long id_compra) {
		this.id_compra = id_compra;
	}
	
	
	@Override
	public String toString() 
	{
		return "Compra_productos [cantidad=" + cantidad + ", codigo_producto=" + codigo_producto  + ", id_compra=" + id_compra + "]";
	}

}
