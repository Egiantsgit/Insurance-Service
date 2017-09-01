package com.util;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		
		Configuration configuration = new Configuration();
		
		configuration.configure();
		
		configuration.addAnnotatedClass(com.domain.Patient.class);
		
		ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	
	
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
		
		
	}
	
}




