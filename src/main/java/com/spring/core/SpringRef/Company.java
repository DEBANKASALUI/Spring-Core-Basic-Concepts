package com.spring.core.SpringRef;

public class Company {
	private String companyName;
	private Labour labour;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Labour getLabour() {
		return labour;
	}

	public void setLabour(Labour labour) {
		this.labour = labour;
	}

	public Company(String companyName, Labour labour) {
		super();
		this.companyName = companyName;
		this.labour = labour;
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", labour=" + labour + "]";
	}

}
