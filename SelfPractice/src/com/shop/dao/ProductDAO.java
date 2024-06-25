package com.shop.dao;
import java.util.List;
import com.shop.businessbean.ProductBean;

public interface ProductDAO {
	 	public List<ProductBean> getAllProducts() throws Exception;
	    public ProductBean getProductById(Integer productId) throws Exception;
	    public void addProduct(ProductBean product) throws Exception;
	    public void updateProduct(ProductBean product) throws Exception;
	    public void deleteProduct(Integer productId) throws Exception;
}
