package com.qcodss.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DB {
	
	public static SessionFactory sf = buildSessionFactory();
	
	public static SessionFactory buildSessionFactory(){
		return new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory(){
		return sf;
	}

	
}
