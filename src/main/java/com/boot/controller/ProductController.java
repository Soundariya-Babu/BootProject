package com.boot.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.boot.model.ProductModel;
import com.boot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productServiceObj;
@PostMapping("/insert")	 
	public String Store(@RequestParam("productId") String productId, 
			@RequestParam("productName") String productName) 
	{   
	ProductModel pm=new ProductModel(productId,productName);
	productServiceObj.insert(pm);
		
		return "success";
	}
@PutMapping("/update")
  public String update(@RequestParam("productId") String productId, 
		@RequestParam("productName") String productName)
  {
	productServiceObj.update(productId, productName);
	return "success";
  }

@DeleteMapping("/delete")
public String doDelete(@RequestParam("productId") String productId)
{
	productServiceObj.delete(productId);
	return "success";
}
@GetMapping("/getname")
public ProductModel getNameById(@RequestParam("productId") String productId)
	{
		ProductModel pm=productServiceObj.dolist(productId);
		return pm;
	}
@GetMapping("/list")
public List<ProductModel> listProduct()
{
	List<ProductModel> pml=productServiceObj.listOfProduct();
return pml;
}
}

