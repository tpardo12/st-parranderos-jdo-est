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
public class Factura implements VOFactura
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long idfactura;

	private long ususario;

	

	
	
	
	public Factura() 
	{
		this.idfactura = 0;
		this.ususario = 0;
		
	}


	public Factura(long idfactura, long ususario) 
	{
		this.idfactura = idfactura;
		this.ususario = ususario;
		
	}
	
	public long getIdfactura() {
		return this.idfactura;
	}

	public void setIdfactura(long idfactura) {
		this.idfactura = idfactura;
	}

	public long getUsusario() {
		return this.ususario;
	}

	public void setUsusario(long ususario) {
		this.ususario = ususario;
	}
	
	@Override
	public String toString() 
	{
		return "Factura [idfactura=" + idfactura + ", ususario=" + ususario  + "]";
	}

}
