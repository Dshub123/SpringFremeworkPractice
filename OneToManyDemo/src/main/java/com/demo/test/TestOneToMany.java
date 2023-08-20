package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.User;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//create user object
		User u=new User();
		u.setFname("Rajan");
		u.setLname("Joshi");
		//create set of addresses
		Address a1=new Address("Aundh","Pune","Maharashtra",u);
		Address a2=new Address("Baner","Pune","Maharashtra",u);
		Address a3=new Address("Kothrud","Pune","Maharashtra",u);
		Set<Address> aset=new HashSet<>();
		aset.add(a1);
		aset.add(a2);
		aset.add(a3);
		u.setAddrset(aset);
		session.save(u);
		tr.commit();
		
		
		

	}

}
