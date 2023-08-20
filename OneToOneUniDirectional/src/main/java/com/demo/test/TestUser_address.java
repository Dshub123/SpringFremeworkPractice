package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;

import com.demo.beans.User;

public class TestUser_address {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction  tr=session.beginTransaction();
		///these atr in transient state
		Address addr=new Address("baner","pune","Maharashtra");
		Address addr1=new Address("aundh","pune","Maharashtra");
		User u=new User("Revati","Khadilkar",addr1);
		User u1=new User("Rajan","Khadilkar",addr);
		// convert it into persistent state
		//since in OneToOne annotation we have added casecade.All so no need of saving Address explicitly
		//when you save user, it will save address also
		session.save(u);
		session.save(u1);
		//session.save(addr);
		//session.save(addr1);
		tr.commit();
		session.close();
		
		

	}

}
