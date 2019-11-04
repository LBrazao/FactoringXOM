package supervielle;

import ilog.rules.bom.annotations.BusinessName;

import java.util.Date;

public class Util {

	private static int getCalcularCantidadDiasAHoy;
	private static boolean getFechaDentroDeProrroga;

	private Util() {}

	public Util(
			@BusinessName("getCalcularCantidadDiasAHoy") int getCalcularCantidadDiasAHoy,
			@BusinessName("getFechaDentroDeProrroga") boolean getFechaDentroDeProrroga){
		this();
		Util.getCalcularCantidadDiasAHoy = getCalcularCantidadDiasAHoy;
		Util.getFechaDentroDeProrroga = getFechaDentroDeProrroga;
	}

	public static int getCalcularCantidadDiasAHoy(Date fecha) {

		Date fechaHoy = new Date();

		long hoy = fechaHoy.getTime();
		long fechaNueva = fecha.getTime();
		long diffTime = hoy - fechaNueva;
		long diffDays = diffTime / (1000 * 60 * 60 * 24);

		getCalcularCantidadDiasAHoy = (int) diffDays;
		return getCalcularCantidadDiasAHoy;
	}
	
	public static boolean getFechaDentroDeProrroga(Date fechaVencimiento, int prorroga){
		
		getFechaDentroDeProrroga = false;
		Date hoy = new Date();		
		Date fProrroga = new Date();
		
		fProrroga.setDate(hoy.getDate() - prorroga);
		
		if (fechaVencimiento.after(fProrroga) && fechaVencimiento.before(hoy)){
			getFechaDentroDeProrroga = true;
		}		
		
		return getFechaDentroDeProrroga;
	}
	
	public static void setCambiarColorRegla(Regla regla, String desc, Integer codigo){			 
		regla.descripcion = desc;
		regla.codigo = codigo;	
	}
	
}
