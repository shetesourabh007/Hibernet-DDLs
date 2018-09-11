package com.marlabs.session.examples;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerImpl implements ICustomer {
	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	static {
		System.out.println("loding the hibernet configurationds");
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("hibernet configuration stuff loaded sucessfully");
	}

	@Override
	public void saveCustomer(Customer1 customer1) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Serializable id = session.save(customer1);
			transaction.commit();
			System.out.println("Customer Object Persisted:" + id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void getCustomer(int customerId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Customer1 customer1 = (Customer1) session.load(Customer1.class,
					customerId);
			System.out
					.println("-----------------------------------------------");
			System.out.println("The customer Object you Are looking for");
			System.out.println(customer1);
			System.out
					.println("-----------------------------------------------");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateCustomer(final Customer1 customer1) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			session.update(customer1);
			transaction.commit();
			System.out.println("Customer Object Updated");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeCustomer(Customer1 customer1) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			session.delete(customer1);
			transaction.commit();
			System.out.println("Customer Object removed");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
	}

}
