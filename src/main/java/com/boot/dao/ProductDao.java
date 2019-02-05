package com.boot.dao;
import java.util.List;
import com.boot.model.ProductModel;

public interface ProductDao {

	public void insert(ProductModel pm);
	public void update(String productId,String productname);
	  public void delete(String productId);
	  public ProductModel getName(String productId);
	  public List<ProductModel> listOfProduct();
}
