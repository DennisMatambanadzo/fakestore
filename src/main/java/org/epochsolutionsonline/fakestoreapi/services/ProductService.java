package org.epochsolutionsonline.fakestoreapi.services;

import org.epochsolutionsonline.fakestoreapi.models.Product;
import org.epochsolutionsonline.fakestoreapi.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product saveProduct (Product product) {


        return productRepository.save(product);
    }

    public List<Product> getProducts() {

        return productRepository.findAll();
    }
}
