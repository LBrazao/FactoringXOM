package supervielle;

import java.util.Date;

public class DatosLinea {
	protected Date fechaLinea;
	protected Double limiteLinea;
	protected Double utilizadoLinea;
	
	public Date getFechaLinea() {
		return fechaLinea;
	}
	public void setFechaLinea(Date fechaLinea) {
		this.fechaLinea = fechaLinea;
	}
	public Double getLimiteLinea() {
		return limiteLinea;
	}
	public void setLimiteLinea(Double limiteLinea) {
		this.limiteLinea = limiteLinea;
	}
	public Double getUtilizadoLinea() {
		return utilizadoLinea;
	}
	public void setUtilizadoLinea(Double utilizadoLinea) {
		this.utilizadoLinea = utilizadoLinea;
	}	
	
}
