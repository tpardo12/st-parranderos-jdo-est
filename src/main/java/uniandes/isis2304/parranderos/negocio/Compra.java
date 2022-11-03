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
public class Compra implements VOCompra
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long idcompra;

	private int preciototal;

	
	
	public Compra() 
	{
		this.idcompra = 0;
		this.preciototal = 0;
		
	}


	public Compra(long idcompra, int preciototal) 
	{
		this.idcompra = idcompra;
		this.preciototal = preciototal;
		
	}
	
	public long getIdcompra() {
		return this.idcompra;
	}

	public void setIdcompra(long idcompra) {
		this.idcompra = idcompra;
	}

	public int getPreciototal() {
		return this.preciototal;
	}

	public void setPreciototal(int preciototal) {
		this.preciototal = preciototal;
	}
	
	
	@Override
	public String toString() 
	{
		return "Bebida [idcompra=" + idcompra + ", preciototal=" + preciototal  + "]";
	}

}
