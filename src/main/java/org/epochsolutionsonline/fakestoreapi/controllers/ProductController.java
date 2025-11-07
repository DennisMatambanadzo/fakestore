package org.epochsolutionsonline.fakestoreapi.controllers;


import org.epochsolutionsonline.fakestoreapi.models.Product;
import org.epochsolutionsonline.fakestoreapi.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {

        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }
}
