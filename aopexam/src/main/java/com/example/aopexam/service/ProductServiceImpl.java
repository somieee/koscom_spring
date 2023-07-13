package com.example.aopexam.service;

import com.example.aopexam.dao.ProductDao;
import com.example.aopexam.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductDao productDao;

  @Override
  public void addProduct(Product product) {
    System.out.println("service addProduct start!!");
    productDao.addProduct(product);
    System.out.println("service addProduct end!!");
  }

  @Override
  public Product findByProductName(String name) {
    System.out.println("service findByProductName start!!");
    return productDao.findProduct(name);
  }
}
