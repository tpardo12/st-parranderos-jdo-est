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
public class Productos_promocion implements VOProductos_promocion
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long codigo_promocion;

	private long id_promocion;

	
	
	public Productos_promocion() 
	{
		this.codigo_promocion = 0;
		this.id_promocion = 0;
		
	}


	public Productos_promocion(long codigo_promocion, long id_promocion) 
	{
		this.codigo_promocion = codigo_promocion;
		this.id_promocion = id_promocion;
		
	}
	
	
	public long getCodigo_promocion() {
		return this.codigo_promocion;
	}

	public void setCodigo_promocion(long codigo_promocion) {
		this.codigo_promocion = codigo_promocion;
	}

	public long getId_promocion() {
		return this.id_promocion;
	}

	public void setId_promocion(long id_promocion) {
		this.id_promocion = id_promocion;
	}

	
	@Override
	public String toString() 
	{
		return "Productos_promocion [codigo_promocion=" + codigo_promocion + ", id_promocion=" + id_promocion  + "]";
	}

}
