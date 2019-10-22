package supervielle;

public class Semaforo {
	protected Integer codigo;
	protected Integer idFallo;
	protected Integer idSector;
	protected String descripcion;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getIdFallo() {
		return idFallo;
	}

	public void setIdFallo(Integer idFallo) {
		this.idFallo = idFallo;
	}

	public Integer getIdSector() {
		return idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
