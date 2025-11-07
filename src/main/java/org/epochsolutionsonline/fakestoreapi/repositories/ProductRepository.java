package org.epochsolutionsonline.fakestoreapi.repositories;

import org.epochsolutionsonline.fakestoreapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  }