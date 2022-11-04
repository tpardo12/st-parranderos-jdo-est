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
 * Clase para modelar la relación SIRVEN del negocio de los Parranderos:
 * Cada objeto de esta clase representa el hecho que un bar sirve una bebida y viceversa.
 * Se modela mediante los identificadores del bar y de la bebida respectivamente
 * Debe existir un bar con el identificador dado
 * Debe existir una bebida con el identificador dado 
 * Adicionalmente contiene el horario (DIURNO, NOCTURNO, TODOS) en el cual el bar sirve la bebida
 * 
 * @author Germán Bravo
 */
public class Promocion implements VOPromocion
{
	
	private long id_promocion;
	private String descripcion;
	private int cantidad_productos;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Promocion () 
	{
		
		this.id_promocion = 0;
		this.descripcion = "";
		this.cantidad_productos = 0;
		
	}

	/**
	 * Constructor con valores
	 * @param idBar - El identificador del bar. Debe exixtir un bar con dicho identificador
	 * @param idBebida - El identificador de la bebida. Debe existir una bebida con dicho identificador
	 * @param horario - El horario en el que el bar sirve la bebida (DIURNO, NOCTURNO, TODOS)
	 */
	public Promocion (long id_promocion, String descripcion, int cantidad_productos) 
	{
		this.id_promocion = id_promocion;
		this.descripcion = descripcion;
		this.cantidad_productos = cantidad_productos;
		
	}
	

	
	public long getId_promocion() {
		return this.id_promocion;
	}

	public void setId_promocion(long id_promocion) {
		this.id_promocion = id_promocion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad_productos() {
		return this.cantidad_productos;
	}

	public void setCantidad_productos(int cantidad_productos) {
		this.cantidad_productos = cantidad_productos;
	}

	
	@Override
	public String toString() 
	{
		return "Promocion [id_promocion=" + id_promocion + ", descripcion=" + descripcion + ", cantidad_productos=" + cantidad_productos + "]";
	}
}
