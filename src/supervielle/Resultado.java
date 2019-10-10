package supervielle;

import java.util.Vector;


public class Resultado {
	
	protected Vector<ChequeSalida> cheque;
	protected CodigoDescripcion semaforo;
	protected Vector<Control> regla;
	public Vector<ChequeSalida> getCheque() {
		return cheque;
	}
	public void setCheque(Vector<ChequeSalida> cheque) {
		this.cheque = cheque;
	}
	public CodigoDescripcion getSemaforo() {
		return semaforo;
	}
	public void setSemaforo(CodigoDescripcion semaforo) {
		this.semaforo = semaforo;
	}
	public Vector<Control> getRegla() {
		return regla;
	}
	public void setRegla(Vector<Control> regla) {
		this.regla = regla;
	}
}
