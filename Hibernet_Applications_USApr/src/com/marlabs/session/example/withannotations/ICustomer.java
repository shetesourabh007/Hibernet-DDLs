package com.marlabs.session.example.withannotations;

public interface ICustomer {
	public abstract void saveCustomer(final NewCustomer newCustomer);

	public abstract void getCustomer(final int customerId);

	public abstract void updateCustomer(final NewCustomer newCustomer);

	public abstract void removeCustomer(final NewCustomer newCustomer);
}
