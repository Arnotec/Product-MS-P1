package org.arnotec.product;

import org.arnotec.product.entity.Product;
import org.arnotec.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProductMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMsApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null, "Ordi HP", 4500, 8));
            productRepository.save(new Product(null, "Imprimante Epson", 2500, 12));
            productRepository.save(new Product(null, "Smart phone ", 500, 7));
            productRepository.findAll().forEach(p -> {
                System.out.println(p.getName());
            });
        };
    }

}
