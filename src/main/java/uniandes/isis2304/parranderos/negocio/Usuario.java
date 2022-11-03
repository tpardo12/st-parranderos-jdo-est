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
public class Usuario implements VOUsuario
{
	
	private String nombre;
	private String tipoidentificacion;
	private long numidentificacion;
	private String correo;
	private String palabraclave;
	private String rol;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Usuario () 
	{
		
		this.numidentificacion = 0;
		this.nombre = "";
		this.tipoidentificacion = "";
		this.correo = "";
		this.palabraclave = "";
		this.rol = "";
	}

	/**
	 * Constructor con valores
	 * @param idBar - El identificador del bar. Debe exixtir un bar con dicho identificador
	 * @param idBebida - El identificador de la bebida. Debe existir una bebida con dicho identificador
	 * @param horario - El horario en el que el bar sirve la bebida (DIURNO, NOCTURNO, TODOS)
	 */
	public Usuario (long numidentificacion, String tipoidentificacion, String nombre, String correo, String palabraclave, String rol ) 
	{
		this.numidentificacion = numidentificacion;
		this.tipoidentificacion = tipoidentificacion;
		this.nombre = nombre;
		this.correo = correo;
		this.palabraclave = palabraclave;
		this.rol = rol;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoidentificacion() {
		return this.tipoidentificacion;
	}

	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public long getNumidentificacion() {
		return this.numidentificacion;
	}

	public void setNumidentificacion(long numidentificacion) {
		this.numidentificacion = numidentificacion;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPalabraclave() {
		return this.palabraclave;
	}

	public void setPalabraclave(String palabraclave) {
		this.palabraclave = palabraclave;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
	
	@Override
	public String toString() 
	{
		return "Usuario [nombre=" + nombre + ", tipoidentificacion=" + tipoidentificacion + ", numidentificacion=" + numidentificacion +
		", correo=" + correo + ", palabraclave=" + palabraclave + ", rol=" + rol + "]";
	}
}
