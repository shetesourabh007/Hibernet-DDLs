package com.marlabs.session.example.withannotations;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class CustomerImpl implements ICustomer {
	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	static {
		System.out.println("loding the hibernet configurationds");
		configuration = new AnnotationConfiguration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("hibernet configuration stuff loaded sucessfully");
	}

	@Override
	public void saveCustomer(NewCustomer newCustomer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Serializable id = session.save(newCustomer);
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
			NewCustomer newCustomer = (NewCustomer) session.load(
					NewCustomer.class, customerId);
			System.out
					.println("-----------------------------------------------");
			System.out.println("The customer Object you Are looking for");
			System.out.println(newCustomer);
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
	public void updateCustomer(final NewCustomer newCustomer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			session.update(newCustomer);
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
	public void removeCustomer(NewCustomer newCustomer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			session.delete(newCustomer);
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
