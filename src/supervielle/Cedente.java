package supervielle;

public class Cedente {
	protected CodigoDescripcion segmento;
	protected CodigoDescripcion subSegmento;
	protected CodigoDescripcion cartera;
	protected CodigoDescripcion canal;
	protected CodigoDescripcion actividad;

	public CodigoDescripcion getSubSegmento() {
		return subSegmento;
	}

	public void setSubSegmento(CodigoDescripcion subSegmento) {
		this.subSegmento = subSegmento;
	}

	public CodigoDescripcion getSegmento() {
		return segmento;
	}

	public void setSegmento(CodigoDescripcion segmento) {
		this.segmento = segmento;
	}

	public CodigoDescripcion getCartera() {
		return cartera;
	}

	public void setCartera(CodigoDescripcion cartera) {
		this.cartera = cartera;
	}

	public CodigoDescripcion getCanal() {
		return canal;
	}

	public void setCanal(CodigoDescripcion canal) {
		this.canal = canal;
	}

	public CodigoDescripcion getActividad() {
		return actividad;
	}

	public void setActividad(CodigoDescripcion actividad) {
		this.actividad = actividad;
	}

}
