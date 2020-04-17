
/**
 * Un coche es un vehículo que añade un nº de plazas
 * 
 * El coste final de alquiler depende no solo del nº de días de alquiler 
 * sino también del nº de plazas. Si el nº de plazas es > 4 se añaden 5€ más por día
 */
public class Coche {
    private String plazas;
    private double precioFinal;
    
	public String getPlazas() {
		return plazas;
	}
	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinalDescuento(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public Coche(String plazas, double precioFinal) {
		super();
		this.plazas = plazas;
		this.precioFinal = precioFinal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plazas == null) ? 0 : plazas.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precioFinal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (plazas == null) {
			if (other.plazas != null)
				return false;
		} else if (!plazas.equals(other.plazas))
			return false;
		if (Double.doubleToLongBits(precioFinal) != Double.doubleToLongBits(other.precioFinal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Coche [plazas=" + plazas + ", precioFinal=" + precioFinal + "]";
	}
}
