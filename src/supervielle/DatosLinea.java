package supervielle;

import java.util.Date;

public class DatosLinea {
	protected Date fechaVencimiento;
	protected Double limite;
	protected Double utilizadoBt;
	protected Double utilizadoHb;
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Double getUtilizadoBt() {
		return utilizadoBt;
	}
	public void setUtilizadoBt(Double utilizadoBt) {
		this.utilizadoBt = utilizadoBt;
	}
	public Double getUtilizadoHb() {
		return utilizadoHb;
	}
	public void setUtilizadoHb(Double utilizadoHb) {
		this.utilizadoHb = utilizadoHb;
	}	
	
}
