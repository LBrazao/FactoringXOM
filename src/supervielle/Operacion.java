package supervielle;

import java.util.Vector;
import java.util.Date;

public class Operacion {
	protected Vector<Cheque> cheque;
	protected Date fechaVencimientoLinea;
	protected Double limiteLinea;
	protected Double utilizadoLinea;
	protected Double limitePlafond;
	protected Double utilizadoPlafond;

	public Vector<Cheque> getCheque() {
		return cheque;
	}

	public void setCheque(Vector<Cheque> cheque) {
		this.cheque = cheque;
	}

	public Date getFechaVencimientoLinea() {
		return fechaVencimientoLinea;
	}

	public void setFechaVencimientoLinea(Date fechaVencimientoLinea) {
		this.fechaVencimientoLinea = fechaVencimientoLinea;
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

	public Double getLimitePlafond() {
		return limitePlafond;
	}

	public void setLimitePlafond(Double limitePlafond) {
		this.limitePlafond = limitePlafond;
	}

	public Double getUtilizadoPlafond() {
		return utilizadoPlafond;
	}

	public void setUtilizadoPlafond(Double utilizadoPlafond) {
		this.utilizadoPlafond = utilizadoPlafond;
	}

}
