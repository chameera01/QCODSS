package com.qcodss.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DB {
	
	static Session session = null;
	
	public static Session getSession(){
        if(session==null){
            
        	Configuration config = new Configuration();
			SessionFactory sf = config.configure().buildSessionFactory();
			session = sf.openSession();
        	
        }
        
        return session;
    }
	
	
	
}
