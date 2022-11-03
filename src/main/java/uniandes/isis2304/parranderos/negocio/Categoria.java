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
public class Categoria implements VOCategoria
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long id_categoria;

	private String tipo;

	
	
	
	public Categoria() 
	{
		this.id_categoria = 0;
		this.tipo = "";
		
	}


	public Categoria(long id_categoria, String tipo) 
	{
		this.id_categoria = id_categoria;
		this.tipo = tipo;
		
	}
	
	public long getId_categoria() {
		return this.id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() 
	{
		return "Bebida [id_categoria=" + id_categoria + ", tipo=" + tipo  + "]";
	}

}
