package com.boot.service;
import java.util.List;
import com.boot.model.ProductModel;

public interface ProductService {
public void insert(ProductModel p);
public void update(String productId,String productname);
public void delete(String productId);
public ProductModel dolist(String productId);
public List<ProductModel> listOfProduct();

}

