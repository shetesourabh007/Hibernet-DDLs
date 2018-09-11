package com.marlabs.session.examples;

public interface ICustomer {
	public abstract void saveCustomer(final Customer1 customer1);

	public abstract void getCustomer(final int customerId);

	public abstract void updateCustomer(final Customer1 customer1);

	public abstract void removeCustomer(final Customer1 customer1);
}
