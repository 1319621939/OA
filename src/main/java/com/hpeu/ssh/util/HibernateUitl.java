package com.hpeu.ssh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUitl {
	
	public static Session session = null;
	public static SessionFactory sFactory = null;
	static{
		StandardServiceRegistry sRegistry = new StandardServiceRegistryBuilder().configure().build();
		sFactory =  new MetadataSources(sRegistry).buildMetadata().buildSessionFactory();
	}
	public static Session getSession() {
		session = sFactory.openSession();
		return session;
	}
	public static void close() {
		if (session != null) {
			session.close();
			
		}
	}

}
