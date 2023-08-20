package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void closeSF();

	void insertNewProduct(Product p);

	List<Product> findAll();

	boolean modifyProduct(int pid, int qty, double price);

	boolean removeById(int pid);

	Product findById(int pid);

}
