package com.example.aopexam.dao;

import com.example.aopexam.domain.Product;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

  private Map<String, Product> storage = new HashMap<>();

  @Override
  public void addProduct(Product product) {
    System.out.println("dao addProduct run!!");
    storage.put(product.getName(), product);
  }

  @Override
  public Product findProduct(String name) {
    System.out.println("dao findProduct run!!");
    return storage.get(name);
  }
}
