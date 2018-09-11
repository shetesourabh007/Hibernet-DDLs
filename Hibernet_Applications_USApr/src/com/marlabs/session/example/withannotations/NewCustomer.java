package com.marlabs.session.example.withannotations;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Customer1")
public class NewCustomer implements Serializable {
	@Id
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerEmailId")
	private String customerEmailId;
	@Column(name = "customerCity")
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
