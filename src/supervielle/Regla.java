package supervielle;

import java.util.Vector;

public class Regla {
	
	protected String nombre;
	protected Integer codigo;
	protected String descripcion;
	protected Integer id;
	protected Vector<Detalle> detalle;
	

	public Vector<Detalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(Vector<Detalle> detalle) {
		this.detalle = detalle;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
}
