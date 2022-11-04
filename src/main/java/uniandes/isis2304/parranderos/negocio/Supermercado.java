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
public class Supermercado implements VOSupermercado
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long id_supermercado;

	private String nombre;

	

	
	
	
	public Supermercado() 
	{
		this.id_supermercado = 0;
		this.nombre = "";
		
	}


	public Supermercado(long id_supermercado, String nombre) 
	{
		this.id_supermercado = id_supermercado;
		this.nombre = nombre;
		
	}
	
	public long getId_supermercado() {
		return this.id_supermercado;
	}

	public void setId_supermercado(long id_supermercado) {
		this.id_supermercado = id_supermercado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() 
	{
		return "Supermercado [id_supermercado=" + id_supermercado + ", nombre=" + nombre  + "]";
	}

}
