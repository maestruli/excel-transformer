package org.gaviot.transformer.model.generic;

public class ElProgresoMailOrder implements Order {

	private String number;
	private String requestedDate;
	private String clientName;
	private String address;
	private String location;
	private String insurance_company;
	private String insured_object;
	private String covered_risk;
	private String insured_amount;
	private String validity;

	public ElProgresoMailOrder() {
		super();
	}

	public ElProgresoMailOrder(String number, String requestedDate, String clientName, String address, String location,
			String insurance_company, String insured_object, String covered_risk, String insured_amount, String validity) {
		super();
		this.number = number;
		this.requestedDate = requestedDate;
		this.clientName = clientName;
		this.address = address;
		this.location = location;
		this.insurance_company = insurance_company;
		this.insured_object = insured_object;
		this.covered_risk = covered_risk;
		this.insured_amount = insured_amount;
		this.validity = validity;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setInsurance_company(String insurance_company) {
		this.insurance_company = insurance_company;
	}

	public void setInsured_object(String insured_object) {
		this.insured_object = insured_object;
	}

	public void setCovered_risk(String covered_risk) {
		this.covered_risk = covered_risk;
	}

	public void setInsured_amount(String insured_amount) {
		this.insured_amount = insured_amount;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getNumber()
	 */
	@Override
	public String getNumber() {
		return this.number;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getRequestedDate()
	 */
	@Override
	public String getRequestedDate() {
		return this.requestedDate;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getClientName()
	 */
	@Override
	public String getClientName() {
		return this.clientName;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getAddress()
	 */
	@Override
	public String getAddress() {
		return this.getAddress();
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getLocation()
	 */
	@Override
	public String getLocation() {
		return this.location;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getInsurance_company()
	 */
	@Override
	public String getInsurance_company() {
		return this.insurance_company;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getInsured_object()
	 */
	@Override
	public String getInsured_object() {
		return this.insured_object;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getCovered_risk()
	 */
	@Override
	public String getCovered_risk() {
		return this.covered_risk;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getInsured_amount()
	 */
	@Override
	public String getInsured_amount() {
		return this.insured_amount;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getValidity()
	 */
	@Override
	public String getValidity() {
		return this.getValidity();
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getStartValidity()
	 */
	@Override
	public String getStartValidity() {
		return this.getValidity().substring(0, 10).trim();
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getEndValidity()
	 */
	@Override
	public String getEndValidity() {
		return this.getValidity().substring(13, 23).trim();
	}

}
