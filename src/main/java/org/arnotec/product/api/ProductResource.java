package org.arnotec.product.api;

import org.arnotec.product.entity.Product;
import org.arnotec.product.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class ProductResource {
    private ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/products")
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/products/{id}")
    public Product findById(@PathVariable Long id) {
         return productRepository.findById(id).get();
    }

    @PostMapping(path = "/products")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping(path = "/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @DeleteMapping(path = "/products/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }


}
