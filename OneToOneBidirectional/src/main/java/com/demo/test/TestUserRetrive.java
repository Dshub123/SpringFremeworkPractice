package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.User;

public class TestUserRetrive {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
//		  System.out.println("before get  user"); 
//		  User u=session.get(User.class, 1);
//		  System.out.println(u.getFname()+u.getLname());
//		  System.out.println("before getAddr"); Address a=u.getAddr();
//		  System.out.println(a); 
//		  tr.commit(); 
//		  session.close();
		 
		
//		  System.out.println("before load  user"); 
//		  User u=session.load(User.class, 1);
//		  System.out.println(u.getFname()+u.getLname());
//		  System.out.println("before getAddr"); 
//		  Address a=u.getAddr();
//		  System.out.println(a); 
//		  tr.commit(); 
//		  session.close();
		
		  System.out.println("before load  user"); 
		  Address addr= session.get(Address.class, 1);
		  System.out.println(addr.getStreet()+"--"+addr.getState());
		  System.out.println("before getAddr"); 
		  User u = addr.getU();
		  System.out.println(u); 
		  tr.commit(); 
		  session.close();
		 

	}

}
