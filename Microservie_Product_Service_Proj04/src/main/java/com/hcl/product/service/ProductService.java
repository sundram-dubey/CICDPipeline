package com.hcl.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hcl.product.dto.ProductRequest;
import com.hcl.product.dto.ProductResponse;
import com.hcl.product.model.Product;
import com.hcl.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

	private final ProductRepository productRepository;

	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder().name(productRequest.getName()).description(productRequest.getDescription())
				.price(productRequest.getPrice()).build();
		System.out.println(product);
		productRepository.save(product);
		log.info("Product {} is saved", product.getId());
	}

	public List<ProductResponse> getAllProduct() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());
	}

	private ProductResponse mapToProductResponse(Product product) {

		return ProductResponse.builder().id(product.getId()).name(product.getName())
				.description(product.getDescription()).price(product.getPrice()).build();
	}
}
