package com.marlabs.session.examples;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer1 implements Serializable {
	private int customerId;
	private String customerName;
	private String customerEmailId;
	private String customerCity;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "NewCustomer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerEmailId=" + customerEmailId
				+ ", customerCity=" + customerCity + "]";
	}

}
