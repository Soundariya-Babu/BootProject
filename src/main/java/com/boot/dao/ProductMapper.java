package com.boot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.boot.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel>{
	public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
	      ProductModel pm=new ProductModel();
	      pm.setProductId(rs.getString("product_id"));
	      pm.setProductName(rs.getString("product_name"));
	      
	      return pm;
	   }
}
