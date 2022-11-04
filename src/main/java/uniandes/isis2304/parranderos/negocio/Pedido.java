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
public class Pedido implements VOpedido
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long id_pedido;

	private long producto;

	private long proveedor;

	private int precio;

	private int cantidad;

	private String fecha_entrega;

	private String fecha_esperada;

	
	

	

	
	public Pedido() 
	{
		this.id_pedido = 0;
		this.producto = 0;
		this.proveedor = 0;
		this.precio = 0;
		this.cantidad = 0;
		this.fecha_entrega = "";
		this.fecha_esperada = "";
		
	}


	public Pedido(long id_pedido, long producto, long proveedor ,  int precio , int cantidad,String fecha_entrega, String fecha_esperada) 
	{
		this.id_pedido = id_pedido;
		this.producto = producto;
		this.proveedor = proveedor;
		this.precio = precio;
		this.cantidad = cantidad;
		this.fecha_entrega = fecha_entrega;
		this.fecha_esperada = fecha_esperada;
		
		
	}
	public long getId_pedido() {
		return this.id_pedido;
	}

	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public long getProducto() {
		return this.producto;
	}

	public void setProducto(long producto) {
		this.producto = producto;
	}

	public long getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(long proveedor) {
		this.proveedor = proveedor;
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

	public String getFecha_entrega() {
		return this.fecha_entrega;
	}

	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getFecha_esperada() {
		return this.fecha_esperada;
	}

	public void setFecha_esperada(String fecha_esperada) {
		this.fecha_esperada = fecha_esperada;
	}

	

	@Override
	public String toString() 
	{
		return "Pedido [id_pedido=" + id_pedido + ", producto=" + producto  + ", producto=" + producto  + 
		", proveedor=" + proveedor  + ", precio=" + precio  + ", cantidad=" + cantidad  + ", fecha_entrega=" + fecha_entrega  +
		", fecha_esperada=" + fecha_esperada +
		"]";
	}

}
