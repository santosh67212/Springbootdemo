package com.zensar.services;

import java.util.List;

import com.zensar.entity.Product;

public interface ProductService {

	Product insertProduct(Product product);

	public List<Product> getAllProducts();

	public Product getProduct(int productId);

	public void deleteProduct(int productId);

}
