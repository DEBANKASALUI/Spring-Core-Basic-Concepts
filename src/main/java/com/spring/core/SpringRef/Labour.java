package com.spring.core.SpringRef;

public class Labour {
	private String labourName;

	public String getLabourName() {
		return labourName;
	}

	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}

	public Labour(String labourName) {
		super();
		this.labourName = labourName;
	}

	public Labour() {
		super();
	}

	@Override
	public String toString() {
		return "Labour [labourName=" + labourName + "]";
	}
	

}
