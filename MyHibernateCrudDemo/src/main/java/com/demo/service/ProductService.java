package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void closeSessionFactory();

	void addnewProduct();

	List<Product> displayAll();

	boolean updateProduct(int pid, int qty, double price);

	boolean deleteById(int pid);

	Product getById(int pid);

}
