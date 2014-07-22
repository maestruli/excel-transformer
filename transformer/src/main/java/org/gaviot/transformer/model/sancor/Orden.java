package org.gaviot.transformer.model.sancor;

/**
 * The Class Orden.
 */
public class Orden {
	private String idOrden;
	private String fechaRegistro;
	private String clienteDomicilio;
	private String riesgoLocalidad;
	private String aseguradora;
	private String bienAsegurado;
	private String riesgoACubrir;
	private String sumaAsegurada;
	private String vigencia;
	private String observaciones;
	private String vigenciaInicio;
	private String vigenciaFin;

	/**
	 * Instantiates a new orden.
	 */
	public Orden() {
		super();
	}
	
	/**
	 * Instantiates a new orden.
	 *
	 * @param idOrden the id orden
	 * @param fechaRegistro the fecha registro
	 * @param clienteDomicilio the cliente domicilio
	 * @param riesgoLocalidad the riesgo localidad
	 * @param aseguradora the aseguradora
	 * @param bienAsegurado the bien asegurado
	 * @param riesgoACubrir the riesgo a cubrir
	 * @param sumaAsegurada the suma asegurada
	 * @param vigencia the vigencia
	 * @param observaciones the observaciones
	 * @param vigenciaInicio the vigencia inicio
	 * @param vigenciaFin the vigencia fin
	 */
	public Orden(String idOrden, String fechaRegistro, String clienteDomicilio, String riesgoLocalidad,
			String aseguradora, String bienAsegurado, String riesgoACubrir, String sumaAsegurada, String vigencia,
			String observaciones, String vigenciaInicio, String vigenciaFin) {
		super();
		this.idOrden = idOrden;
		this.fechaRegistro = fechaRegistro;
		this.clienteDomicilio = clienteDomicilio;
		this.riesgoLocalidad = riesgoLocalidad;
		this.aseguradora = aseguradora;
		this.bienAsegurado = bienAsegurado;
		this.riesgoACubrir = riesgoACubrir;
		this.sumaAsegurada = sumaAsegurada;
		this.vigencia = vigencia;
		this.observaciones = observaciones;
		this.vigenciaInicio = vigenciaInicio;
		this.vigenciaFin = vigenciaFin;
	}

	/**
	 * Gets the id orden.
	 *
	 * @return the id orden
	 */
	public String getIdOrden() {
		return idOrden;
	}

	/**
	 * Sets the id orden.
	 *
	 * @param idOrden the new id orden
	 */
	public void setIdOrden(String idOrden) {
		this.idOrden = idOrden;
	}

	/**
	 * Gets the fecha registro.
	 *
	 * @return the fecha registro
	 */
	public String getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * Sets the fecha registro.
	 *
	 * @param fechaRegistro the new fecha registro
	 */
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * Gets the cliente domicilio.
	 *
	 * @return the cliente domicilio
	 */
	public String getClienteDomicilio() {
		return clienteDomicilio;
	}

	/**
	 * Sets the cliente domicilio.
	 *
	 * @param clienteDomicilio the new cliente domicilio
	 */
	public void setClienteDomicilio(String clienteDomicilio) {
		this.clienteDomicilio = clienteDomicilio;
	}

	/**
	 * Gets the riesgo localidad.
	 *
	 * @return the riesgo localidad
	 */
	public String getRiesgoLocalidad() {
		return riesgoLocalidad;
	}

	/**
	 * Sets the riesgo localidad.
	 *
	 * @param riesgoLocalidad the new riesgo localidad
	 */
	public void setRiesgoLocalidad(String riesgoLocalidad) {
		this.riesgoLocalidad = riesgoLocalidad;
	}

	/**
	 * Gets the aseguradora.
	 *
	 * @return the aseguradora
	 */
	public String getAseguradora() {
		return aseguradora;
	}

	/**
	 * Sets the aseguradora.
	 *
	 * @param aseguradora the new aseguradora
	 */
	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}

	/**
	 * Gets the bien asegurado.
	 *
	 * @return the bien asegurado
	 */
	public String getBienAsegurado() {
		return bienAsegurado;
	}

	/**
	 * Sets the bien asegurado.
	 *
	 * @param bienAsegurado the new bien asegurado
	 */
	public void setBienAsegurado(String bienAsegurado) {
		this.bienAsegurado = bienAsegurado;
	}

	/**
	 * Gets the riesgo a cubrir.
	 *
	 * @return the riesgo a cubrir
	 */
	public String getRiesgoACubrir() {
		return riesgoACubrir;
	}

	/**
	 * Sets the riesgo a cubrir.
	 *
	 * @param riesgoACubrir the new riesgo a cubrir
	 */
	public void setRiesgoACubrir(String riesgoACubrir) {
		this.riesgoACubrir = riesgoACubrir;
	}

	/**
	 * Gets the suma asegurada.
	 *
	 * @return the suma asegurada
	 */
	public String getSumaAsegurada() {
		return sumaAsegurada;
	}

	/**
	 * Sets the suma asegurada.
	 *
	 * @param sumaAsegurada the new suma asegurada
	 */
	public void setSumaAsegurada(String sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	/**
	 * Gets the vigencia.
	 *
	 * @return the vigencia
	 */
	public String getVigencia() {
		return vigencia;
	}

	/**
	 * Sets the vigencia.
	 *
	 * @param vigencia the new vigencia
	 */
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	/**
	 * Gets the observaciones.
	 *
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * Sets the observaciones.
	 *
	 * @param observaciones the new observaciones
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * Gets the vigencia inicio.
	 *
	 * @return the vigencia inicio
	 */
	public String getVigenciaInicio() {
		return vigenciaInicio;
	}

	/**
	 * Sets the vigencia inicio.
	 *
	 * @param vigenciaInicio the new vigencia inicio
	 */
	public void setVigenciaInicio(String vigenciaInicio) {
		this.vigenciaInicio = vigenciaInicio;
	}

	/**
	 * Gets the vigencia fin.
	 *
	 * @return the vigencia fin
	 */
	public String getVigenciaFin() {
		return vigenciaFin;
	}

	/**
	 * Sets the vigencia fin.
	 *
	 * @param vigenciaFin the new vigencia fin
	 */
	public void setVigenciaFin(String vigenciaFin) {
		this.vigenciaFin = vigenciaFin;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", fechaRegistro=" + fechaRegistro + ", clienteDomicilio="
				+ clienteDomicilio + ", riesgoLocalidad=" + riesgoLocalidad + ", aseguradora=" + aseguradora
				+ ", bienAsegurado=" + bienAsegurado + ", riesgoACubrir=" + riesgoACubrir + ", sumaAsegurada="
				+ sumaAsegurada + ", vigencia=" + vigencia + ", observaciones=" + observaciones + ", vigenciaInicio="
				+ vigenciaInicio + ", vigenciaFin=" + vigenciaFin + "]";
	}

}
