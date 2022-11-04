

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public interface VOSucursal
{
	
	

	public long getId_sucursal();
	public String getCiudad();

	public String getDireccion() ;

	public long getSupermercado();
	public String getNombre();

	
   
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();
	

}
