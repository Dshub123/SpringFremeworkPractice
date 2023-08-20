package com.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
     private static SessionFactory sf;
     static {
    	 sf=HBUtil.getMySessionFactory();
     }
	@Override
	public void closeSF() {
		HBUtil.closeMySessionFactory();
		
	}
	@Override
	public void insertNewProduct(Product p) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();
		
	}
	@Override
	public List<Product> findAll() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//String str="from Product p";
		//Query q=session.createQuery(str);
		//List<Product> plist=q.list();
		Criteria cr=session.createCriteria(Product.class);
		List<Product> plist=cr.list();
		tr.commit();
		session.close();
		return plist;
	}
	@Override
	public boolean modifyProduct(int pid, int qty, double price) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(Product.class,pid);
		if(p!=null) {
			p.setPrice(price);
			p.setQty(qty);
			session.update(p);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}
	@Override
	public boolean removeById(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(Product.class, pid);
		if(p!=null) {
		    session.delete(p);
		    tr.commit();
		    session.close();
		    return true;
		}
		 session.close();
		    return false;
	}
	@Override
	public Product findById(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(Product.class,pid);
		tr.commit();
		session.close();
		return p;
	}
	
	
}
