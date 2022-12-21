package com.programmingmsa.productservice.repository;

import com.programmingmsa.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
