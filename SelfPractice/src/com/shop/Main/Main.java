package com.shop.Main;

import com.shop.businessbean.ProductBean;
import com.shop.service.ProductService;
import com.shop.service.CustomerService;
import com.shop.service.OrderService;
import com.shop.utility.Factory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = Factory.createProductService();
        CustomerService customerService = Factory.createCustomerService();
        OrderService orderService = Factory.createOrderService();

        // Example usage of ProductService
        try {
            // Get all products
            List<ProductBean> products = productService.getAllProducts();
            for (ProductBean product : products) {
                System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName());
            }

            // Add a new product
            ProductBean newProduct = new ProductBean();
            newProduct.setProductName("New Product");
            newProduct.setCategory("Electronics");
            newProduct.setPrice(99.99);
            productService.addProduct(newProduct);

            // Update an existing product
            ProductBean existingProduct = productService.getProductById(1);
            existingProduct.setPrice(49.99);
            productService.updateProduct(existingProduct);

            // Delete a product
            productService.deleteProduct(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
