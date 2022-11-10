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

package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

/**
 * Clase que encapsula los métodos que hacen acceso a la base de datos para el concepto BAR de Parranderos
 * Nótese que es una clase que es sólo conocida en el paquete de persistencia
 * 
 * @author Germán Bravo
 */
class SQLUtil
{
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaParranderos pp;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/

	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLUtil (PersistenciaParranderos pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para obtener un nuevo número de secuencia
	 * @param pm - El manejador de persistencia
	 * @return El número de secuencia generado
	 */
	public long nextval (PersistenceManager pm)
	{
        Query q = pm.newQuery(SQL, "SELECT "+ pp.darSeqParranderos () + ".nextval FROM DUAL");
        q.setResultClass(Long.class);
        long resp = (long) q.executeUnique();
        return resp;
	}

	/**
	 * Crea y ejecuta las sentencias SQL para cada tabla de la base de datos - EL ORDEN ES IMPORTANTE 
	 * @param pm - El manejador de persistencia
	 * @return Un arreglo con 7 números que indican el número de tuplas borradas en las tablas GUSTAN, SIRVEN, VISITAN, BEBIDA,
	 * TIPOBEBIDA, BEBEDOR y BAR, respectivamente
	 */
	public long [] limpiarParranderos (PersistenceManager pm)
	{
        Query qBogdega = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaBodega ());          
        Query qCategoria = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCategoria() );
        Query qcompra_productos = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCompra_Producto());
        Query qCompra = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCompra ());
        Query qEstante = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEstante ());
        Query qFactura = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaFactura ());
        Query qPedido = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaProductos_Promocion() );
		Query qProductos = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaProducto() );          
        Query qProductos_promocion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaProductos_Promocion() );
        Query qRol = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaRol());
        Query qPromocion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPromocion ());
        Query qProveedor = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaProveedor() );
        Query qsucursal = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaSucursal() );
        Query qsupermercado = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaSupermercado() );
		Query qUsuario = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaUsuario() );


        long bodegaElimidados = (long) qBogdega.executeUnique ();
        long cateogriaEliminados = (long) qCategoria.executeUnique ();
        long compra_productoEliminados = (long) qcompra_productos.executeUnique ();
        long compraEliminados = (long) qCompra.executeUnique ();
        long estanteEliminados = (long) qEstante.executeUnique ();
        long facturaEliminados = (long) qFactura.executeUnique ();
        long pedidoEliminados = (long) qPedido.executeUnique ();
		long productoEliminados = (long) qProductos.executeUnique ();
        long producto_promocionEliminados = (long) qProductos_promocion.executeUnique ();
        long rolElimiados = (long) qRol.executeUnique ();
        long promocionEliminados = (long) qPromocion.executeUnique ();
        long proveedorEliminados = (long) qProveedor.executeUnique ();
		long sucursalEliminados = (long) qsucursal.executeUnique ();
        long supermercadoEliminados = (long) qsupermercado.executeUnique ();
        long usuarioEliminados = (long) qUsuario.executeUnique ();
        return new long[] {bodegaElimidados, cateogriaEliminados, compra_productoEliminados, compraEliminados, 
			estanteEliminados, facturaEliminados, pedidoEliminados, productoEliminados,producto_promocionEliminados, rolElimiados,promocionEliminados,proveedorEliminados,
			sucursalEliminados,supermercadoEliminados, usuarioEliminados
		};
	}

}
