package com.zensar.springboot.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.springboot.product.entity.Product;

public interface ProductRepository extends JpaRepositary<Product, Integer> {

	List<Product> findByProductName(String productName);

	List<Product> findByProductCost(int productCost);

	List<Product> findByProductCostBetween(int productCost1, int productCost11);

	List<Product> findByProductCostGreaterThan(int productCost);

	List<Product> test(String productName);

	List<Product> test2(int productCost);

	List<Product> test3(String productName, int productCost);

	@Query(value = "seect*from Product Where product_name=:name and product_cost=:cost", nativeQuery = true)

	List<Product> test4(@Param("name") String productName, @Param("price") int productPrice);

}
