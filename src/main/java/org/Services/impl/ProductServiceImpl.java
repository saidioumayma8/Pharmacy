package org.Services.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.Services.ProductService;
import org.Repository.productRepository;
import org.com.Pharmacy.restapi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class ProductServiceImpl implements ProductService  {

    @Autowired
    private productRepository productRepository;


    @Override
    public Product AddProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product UpdateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void DeleteProduct(int id) {
         productRepository.deleteById(id);
    }

    @Override
    public Product getProducts(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> GetAllProducts() {
        return productRepository.findAll();
    }
}

