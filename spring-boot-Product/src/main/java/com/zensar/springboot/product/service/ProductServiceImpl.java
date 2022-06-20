package com.zensar.springboot.product.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zensar.springboot.product.dto.ProductDto;
import com.zensar.springboot.product.entity.Product;

@Service
public abstract class ProductServiceImpl implements ProductService {

	@Autowired
	private Repository productRepository;

	@Autowired
	private ModelMap modelMapper;

	Pageable p;

	@Override

	public List<ProductDto> findByProductName(String productName) {
		List<Product> listOfProduct = productRepository.findByProductName(productName);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> findByProductCost(int productCost) {
		List<Product> listOfProduct = productRepository.findByProductCost(productCost);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> findByProductCostBetween(int productCost1, int productCost2) {
		List<Product> listOfProduct = productRepository.findByProductCostBetween(productCost1, productCost2);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> test(String productName) {
		List<Product> listOfProduct = productRepository.test(productName);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> test2(int productCost) {
		List<Product> listOfProduct = productRepository.test2(productCost);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> test3(String productName, int productCost) {
		List<Product> listOfProduct = productRepository.test3(productName, productCost);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> test4(String productName, int productCost) {
		List<Product> listOfProduct = productRepository.test4(productName, productCost);
		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add( modelMapper).map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

	@Override
	public List<ProductDto> findByProductCostGreaterThan(int productCost) {
		List<Product> listOfProduct =  productRepository.findByProductCostGreaterThan(productCost);

		List<ProductDto> lsitOfDto = new ArrayList<ProductDto>();
		for (Product product : listOfProduct) {
			lsitOfDto.add(((Object) modelMapper).map(product, ProductDto.class));
		}
		return lsitOfDto;
	}

}
