package supervielle;

import java.util.Date;

public class DatosLinea {
	protected Date fechaVencimiento;
	protected Double limite;
	protected Double utilizado;

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

	public Double getUtilizado() {
		return utilizado;
	}

	public void setUtilizado(Double utilizado) {
		this.utilizado = utilizado;
	}

}
