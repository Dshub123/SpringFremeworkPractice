package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.User;

public class TestRetrieveUser_address {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		User u=session.get(User.class, 7);
		System.out.println(u.getFname()+"--->"+u.getLname());
		System.out.println("before getaddress");
		System.out.println(u.getAddrset());
		
		
		Address addr=session.get(Address.class, 1);
		System.out.println(addr.getCity()+"--->"+addr.getStreet());
		System.out.println("before getuser");
		System.out.println(addr.getU());
	}
}
