package supervielle;

import java.util.Vector;

public class ChequeSalida {
	
	protected Integer id;
	protected CodigoDescripcion estado;
	protected Vector<CodigoDescripcion> regla;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CodigoDescripcion getEstado() {
		return estado;
	}
	public void setEstado(CodigoDescripcion estado) {
		this.estado = estado;
	}
	public ChequeSalida(Integer id,
			CodigoDescripcion estado) {
		super();
		this.id = id;
		this.estado = estado;
	}
	public Vector<CodigoDescripcion> getRegla() {
		return regla;
	}
	public void setRegla(Vector<CodigoDescripcion> regla) {
		this.regla = regla;
	}
}