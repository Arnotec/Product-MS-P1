package org.arnotec.product.entity.projection;

import org.arnotec.product.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "web", types = Product.class)
interface ProductWebProjection {
    String getName();
    double getPrice();
}
