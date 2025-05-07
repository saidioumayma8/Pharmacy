package org.Repository;

import org.com.Pharmacy.restapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {
}
