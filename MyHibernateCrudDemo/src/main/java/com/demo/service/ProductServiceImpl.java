package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public void closeSessionFactory() {
		pdao.closeSF();
		
	}

	@Override
	public void addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter productname");
		String pname=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double pr=sc.nextDouble();
		Product p=new Product(pid,pname,qty,pr);
		pdao.insertNewProduct(p);
		
	}

	@Override
	public List<Product> displayAll() {
		return pdao.findAll();
	}

	@Override
	public boolean updateProduct(int pid, int qty, double price) {
		return pdao.modifyProduct(pid,qty,price);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public Product getById(int pid) {
		return pdao.findById(pid);
	}
	

}
