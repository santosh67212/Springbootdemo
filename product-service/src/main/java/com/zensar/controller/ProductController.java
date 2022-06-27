package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.zensar.entity.Coupon;

import com.zensar.restClient.CouponRestClient;
import com.zensar.entity.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/")
	public Product insertProduct(@RequestBody Product product) {
		ResponseEntity<Coupon> coupon = restTemplate
				.getForEntity("http://localhost:8181/coupons/" + product.getCouponCode(), Coupon.class);
		// ResponseEntity<Coupon>
		// coupon=restTemplate.getForEntity("http://localhost:8181/coupons/"+product.getCouponCode(),
		// Coupon.class, uriVariables);
		Coupon couponObject = coupon.getBody();
		product.setPrice(product.getPrice() - couponObject.getDiscount());

		return productService.insertProduct(product);

	}

	@GetMapping("/getCoupons")
	public List<Coupon> viewCoupons() {
		List<Coupon> coupons = restClient.getAllCoupons();
		return coupons;
	}
}
