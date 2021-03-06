package org.arnotec.product.repository;

import org.arnotec.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "/byName")
    Page<Product> findByNameContains(@Param("keyword") String name, Pageable pageable);

}
