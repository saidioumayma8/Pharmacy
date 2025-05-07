package org.Contollers.impl;

import jakarta.persistence.Id;
import org.Contollers.productController;
import org.Services.ProductService;
import org.com.Pharmacy.restapi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Products")
public class productControllerImpl implements productController {


    @Autowired
    private ProductService productService;





    @Override
    public Product AddProduct(Product product) {
        return productService.AddProduct(product);
    }

    @Override
    public Product retrieveproduct(int id) {
        return productService.getProducts(id);
    }

    @Override
    public List<Product> retrieveAllproducts() {
        return productService.GetAllProducts();
    }
}
