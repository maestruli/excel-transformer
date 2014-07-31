package org.gaviot.transformer.model.generic;

public interface Order {

	public abstract String getNumber();

	public abstract String getRequestedDate();

	public abstract String getClientName();

	public abstract String getAddress();

	public abstract String getLocation();

	public abstract String getInsurance_company();

	public abstract String getInsured_object();

	public abstract String getCovered_risk();

	public abstract String getInsured_amount();

	public abstract String getValidity();

	public abstract String getStartValidity();

	public abstract String getEndValidity();

}