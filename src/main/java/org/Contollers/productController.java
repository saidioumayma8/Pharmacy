package org.Contollers;

import org.com.Pharmacy.restapi.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface productController {

    @PostMapping
    Product AddProduct(@RequestBody Product product);

    @GetMapping("/{id}")
    Product retrieveproduct(@PathVariable int id);

    @GetMapping
    List<Product> retrieveAllproducts();
}
