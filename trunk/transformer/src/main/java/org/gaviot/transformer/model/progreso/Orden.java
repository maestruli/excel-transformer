package org.gaviot.transformer.model.progreso;

/**
 * The Class Orden.
 */
public class Orden {

	private String ordenId;
	private String solicitud;
	private String apellidoNombre;
	private String domicilio;
	private String localidad;
	private String aseguradora;
	private String bienAsegurado;
	private String riesgoACubrir;
	private String sumaAsegurada;
	private String vigencia;

	/**
	 * Instantiates a new orden.
	 *
	 * @param ordenId the orden id
	 * @param solicitud the solicitud
	 * @param apellidoNombre the apellido nombre
	 * @param domicilio the domicilio
	 * @param localidad the localidad
	 * @param aseguradora the aseguradora
	 * @param bienAsegurado the bien asegurado
	 * @param riesgoACubrir the riesgo a cubrir
	 * @param sumaAsegurada the suma asegurada
	 * @param vigencia the vigencia
	 */
	public Orden(String ordenId, String solicitud, String apellidoNombre, String domicilio, String localidad,
			String aseguradora, String bienAsegurado, String riesgoACubrir, String sumaAsegurada, String vigencia) {
		super();
		this.ordenId = ordenId;
		this.solicitud = solicitud;
		this.apellidoNombre = apellidoNombre;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.aseguradora = aseguradora;
		this.bienAsegurado = bienAsegurado;
		this.riesgoACubrir = riesgoACubrir;
		this.sumaAsegurada = sumaAsegurada;
		this.vigencia = vigencia;
	}

	/**
	 * Gets the orden id.
	 *
	 * @return the orden id
	 */
	public String getOrdenId() {
		return ordenId;
	}

	/**
	 * Sets the orden id.
	 *
	 * @param ordenId the new orden id
	 */
	public void setOrdenId(String ordenId) {
		this.ordenId = ordenId;
	}

	/**
	 * Gets the solicitud.
	 *
	 * @return the solicitud
	 */
	public String getSolicitud() {
		return solicitud;
	}

	/**
	 * Sets the solicitud.
	 *
	 * @param solicitud the new solicitud
	 */
	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	/**
	 * Gets the apellido nombre.
	 *
	 * @return the apellido nombre
	 */
	public String getApellidoNombre() {
		return apellidoNombre;
	}

	/**
	 * Sets the apellido nombre.
	 *
	 * @param apellidoNombre the new apellido nombre
	 */
	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}

	/**
	 * Gets the domicilio.
	 *
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * Sets the domicilio.
	 *
	 * @param domicilio the new domicilio
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * Gets the localidad.
	 *
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad the new localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orden [ordenId=" + ordenId + ", solicitud=" + solicitud + ", apellidoNombre=" + apellidoNombre
				+ ", domicilio=" + domicilio + ", localidad=" + localidad + ", aseguradora=" + aseguradora
				+ ", bienAsegurado=" + bienAsegurado + ", riesgoACubrir=" + riesgoACubrir + ", sumaAsegurada="
				+ sumaAsegurada + ", vigencia=" + vigencia + "]";
	}

}
