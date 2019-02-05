package com.boot.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.boot.model.ProductModel;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	   private JdbcTemplate jdbcTemplateObject;
	   
	   
	   public void insert(ProductModel p) {
	      String SQL = "insert into product_model values (?,?)";
	      jdbcTemplateObject.update( SQL,p.getProductId(),p.getProductName());
	     // System.out.println("Created Record Name = " + name + " Age = " + age);
	   }
	   public void update(String productId,String productname)
	   {
		   String sql="UPDATE product_model SET product_name=? WHERE product_id=?";
		   jdbcTemplateObject.update(sql,productname,productId);
	   }
	   public void delete(String productId)
	   {
		   String sql="delete from product_model where product_id=?";
		   jdbcTemplateObject.update(sql,productId);
	   }
	   public ProductModel getName(String productId)
	   {
		   String sql="select * from product_model where product_id=?";
		   ProductModel productModel= jdbcTemplateObject.queryForObject(sql, 
				   new Object[]{productId}, new ProductMapper());
		   return productModel;
	   }
	   public List<ProductModel> listOfProduct()
	   {
		   String sql="select * from product_model";
		   List<ProductModel> pm=jdbcTemplateObject.query(sql,new ProductMapper());
		   return pm;
	   }
}
