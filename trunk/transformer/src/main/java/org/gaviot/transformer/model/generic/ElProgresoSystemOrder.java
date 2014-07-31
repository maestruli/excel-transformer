package org.gaviot.transformer.model.generic;

public class ElProgresoSystemOrder implements Order {

	private String date;
	private String type;
	private String documentNumber;
	private String name;
	private String cpa;
	private String insured_object;
	private String branch;
	private String sum;
	private String currency;
	private String from;
	private String to;
	private String request;
	private String policy;
	private String product;
	private String vehicle;

	public ElProgresoSystemOrder() {
		super();
	}

	public ElProgresoSystemOrder(String date, String type, String documentNumber, String name, String cpa,
			String insured_object, String branch, String sum, String currency, String from, String to, String request,
			String policy, String product, String vehicle) {
		super();
		this.date = date;
		this.type = type;
		this.documentNumber = documentNumber;
		this.name = name;
		this.cpa = cpa;
		this.insured_object = insured_object;
		this.branch = branch;
		this.sum = sum;
		this.currency = currency;
		this.from = from;
		this.to = to;
		this.request = request;
		this.policy = policy;
		this.product = product;
		this.vehicle = vehicle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpa() {
		return cpa;
	}

	public void setCpa(String cpa) {
		this.cpa = cpa;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public void setInsured_object(String insured_object) {
		this.insured_object = insured_object;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getNumber()
	 */
	@Override
	public String getNumber() {
		return this.policy;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getRequestedDate()
	 */
	@Override
	public String getRequestedDate() {
		return this.request;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getClientName()
	 */
	@Override
	public String getClientName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getAddress()
	 */
	@Override
	public String getAddress() {
		return this.type;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getLocation()
	 */
	@Override
	public String getLocation() {
		return this.cpa;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getInsurance_company()
	 */
	@Override
	public String getInsurance_company() {
		return "EL PROGRESO SEGUROS SA";
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
		return "";
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getInsured_amount()
	 */
	@Override
	public String getInsured_amount() {
		return this.sum;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getValidity()
	 */
	@Override
	public String getValidity() {
		return this.from + " - "+ this.to;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getStartValidity()
	 */
	@Override
	public String getStartValidity() {
		return this.from;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.model.generic.Order#getEndValidity()
	 */
	@Override
	public String getEndValidity() {
		return this.to;
	}

}
