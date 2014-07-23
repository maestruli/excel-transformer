package org.gaviot.transformer.model.sancor;

/**
 * The Class OrdenSancorBuilder.
 */
public class OrdenSancorBuilder {

	Orden orden = new Orden();

	/**
	 * Adds the id orden.
	 * 
	 * @param idOrden
	 *            the id orden
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addIdOrden(String idOrden) {
		this.orden.setIdOrden(idOrden);
		return this;
	}

	/**
	 * Adds the fecha registro.
	 * 
	 * @param fechaRegistro
	 *            the fecha registro
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addFechaRegistro(String fechaRegistro) {
		this.orden.setFechaRegistro(fechaRegistro);
		return this;
	}

	/**
	 * Adds the cliente domicilio.
	 * 
	 * @param clienteDomicilio
	 *            the cliente domicilio
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addClienteDomicilio(String clienteDomicilio) {
		this.orden.setClienteDomicilio(clienteDomicilio);
		return this;
	}

	/**
	 * Adds the riesgo localidad.
	 * 
	 * @param riesgoLocalidad
	 *            the riesgo localidad
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addRiesgoLocalidad(String riesgoLocalidad) {
		this.orden.setRiesgoLocalidad(riesgoLocalidad);
		return this;
	}

	/**
	 * Adds the aseguradora.
	 * 
	 * @param aseguradora
	 *            the aseguradora
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addAseguradora(String aseguradora) {
		this.orden.setAseguradora(aseguradora);
		return this;
	}

	/**
	 * Adds the bien asegurado.
	 * 
	 * @param bienAsegurado
	 *            the bien asegurado
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addBienAsegurado(String bienAsegurado) {
		this.orden.setBienAsegurado(bienAsegurado);
		return this;
	}

	/**
	 * Adds the riesgo a cubrir.
	 * 
	 * @param riesgoACubrir
	 *            the riesgo a cubrir
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addRiesgoACubrir(String riesgoACubrir) {
		this.orden.setRiesgoACubrir(riesgoACubrir);
		return this;
	}

	/**
	 * Adds the suma asegurada.
	 * 
	 * @param sumaAsegurada
	 *            the suma asegurada
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addSumaAsegurada(String sumaAsegurada) {
		this.orden.setSumaAsegurada(sumaAsegurada);
		return this;
	}

	/**
	 * Adds the vigencia.
	 * 
	 * @param vigencia
	 *            the vigencia
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addVigencia(String vigencia) {
		this.orden.setVigencia(vigencia);
		return this;
	}

	/**
	 * Adds the observaciones.
	 * 
	 * @param observaciones
	 *            the observaciones
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addObservaciones(String observaciones) {
		this.orden.setObservaciones(observaciones);
		return this;
	}

	/**
	 * Adds the vigencia inicio.
	 * 
	 * @param vigenciaInicio
	 *            the vigencia inicio
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addVigenciaInicio(String vigenciaInicio) {
		this.orden.setVigenciaInicio(vigenciaInicio);
		return this;
	}

	/**
	 * Adds the vigencia fin.
	 * 
	 * @param vigenciaFin
	 *            the vigencia fin
	 * @return the orden sancor builder
	 */
	public OrdenSancorBuilder addVigenciaFin(String vigenciaFin) {
		this.orden.setVigenciaFin(vigenciaFin);
		return this;
	}

	/**
	 * Builds the.
	 *
	 * @return the orden
	 */
	public Orden build() {
		return this.orden;
	}
}
