package org.Services;

import org.com.Pharmacy.restapi.entity.Product;

import java.util.List;

public interface ProductService {

    Product AddProduct(Product product);
    Product UpdateProduct(Product product);
    void DeleteProduct(int id);
    Product getProducts(int id);
    List<Product> GetAllProducts();
}
