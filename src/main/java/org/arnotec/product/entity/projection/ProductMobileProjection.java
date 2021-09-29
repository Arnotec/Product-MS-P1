package org.arnotec.product.entity.projection;

import org.arnotec.product.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Product.class)
interface ProductMobileProjection {
    String getName();
}
