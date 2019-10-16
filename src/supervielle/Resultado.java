package supervielle;

import java.util.Vector;


public class Resultado {
	
	protected Vector<ChequeSalida> cheque;
	protected CodigoDescripcion semaforo;
	protected Vector<Regla> regla;
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
	public Vector<Regla> getRegla() {
		return regla;
	}
	public void setRegla(Vector<Regla> regla) {
		this.regla = regla;
	}
}
