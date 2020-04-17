
/**
 * Una furgoneta es un vehículo que añade la característica del volumen de carga
 * (valor de tipo double)
 * 
 * El coste de alquiler de una furgoneta no solo depende del nº de días de
 * alquiler
 * Tendrá un incremento que dependerá de su volumen de carga: hasta 5 m3
 * exclusive ( metros cúbicos) de volumen el incremento sobre el precio
 * final será de 10€, entre 5 y 10 (inclusive) el incremento sobre el precio
 * final será de 15€, si volumen > 10 el incremento sobre el precio final será de
 * 25€
 * 
 */
public class Furgoneta {
private double volumenCarga;
private String nDias;
private double alquilerFurgoneta;
private double incremento;
public double getVolumenCarga() {
	return volumenCarga;
}
public void setVolumenCarga(double volumenCarga) {
	this.volumenCarga = volumenCarga;
}
public String getnDias() {
	return nDias;
}
public void setnDias(String nDias) {
	this.nDias = nDias;
}
public double getAlquilerFurgoneta() {
	return alquilerFurgoneta;
}
public void setAlquilerFurgoneta(double alquilerFurgoneta) {
	this.alquilerFurgoneta = alquilerFurgoneta;
}
public double getIncremento() {
	return incremento;
}
public void setIncremento(double incremento) {
	this.incremento = incremento;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(alquilerFurgoneta);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(incremento);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((nDias == null) ? 0 : nDias.hashCode());
	temp = Double.doubleToLongBits(volumenCarga);
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
	Furgoneta other = (Furgoneta) obj;
	if (Double.doubleToLongBits(alquilerFurgoneta) != Double.doubleToLongBits(other.alquilerFurgoneta))
		return false;
	if (Double.doubleToLongBits(incremento) != Double.doubleToLongBits(other.incremento))
		return false;
	if (nDias == null) {
		if (other.nDias != null)
			return false;
	} else if (!nDias.equals(other.nDias))
		return false;
	if (Double.doubleToLongBits(volumenCarga) != Double.doubleToLongBits(other.volumenCarga))
		return false;
	return true;
}
public Furgoneta(double volumenCarga, String nDias, double alquilerFurgoneta, double incremento) {
	super();
	this.volumenCarga = volumenCarga;
	this.nDias = nDias;
	this.alquilerFurgoneta = alquilerFurgoneta;
	this.incremento = incremento;
}

}
