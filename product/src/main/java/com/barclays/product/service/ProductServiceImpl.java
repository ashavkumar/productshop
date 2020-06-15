package com.barclays.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.barclays.product.beans.Product;
import com.barclays.product.dao.ProductDao;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	public Product registerProduct(Product product) {
		productDao.save(product);		
		return null;
	}

}
