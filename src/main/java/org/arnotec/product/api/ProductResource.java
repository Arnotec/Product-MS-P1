package org.arnotec.product.api;

import org.arnotec.product.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductResource {
    private ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @DeleteMapping(path = "/productis/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

}
