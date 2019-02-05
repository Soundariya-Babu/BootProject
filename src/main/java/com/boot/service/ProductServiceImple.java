package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ProductDao;
import com.boot.model.ProductModel;

@Service
public class ProductServiceImple implements ProductService{
	  @Autowired
	  private ProductDao productDaoObj;
public void insert(ProductModel p)
{
	productDaoObj.insert(p);
}
public void update(String productId,String productname)
{
	productDaoObj.update(productId, productname);
}
public void delete(String productId)
{
	productDaoObj.delete(productId);
}
public ProductModel dolist(String productId)
{
	ProductModel pm=productDaoObj.getName(productId);
	return pm;
}
public List<ProductModel> listOfProduct()
{
	List<ProductModel> pm=productDaoObj.listOfProduct();
	return pm;
}



}
