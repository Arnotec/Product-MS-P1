package org.arnotec.product.configuration;

import org.arnotec.product.entity.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Configuration
public class RepositoryRestConfigurationBean {
    private RepositoryRestConfiguration restConfiguration;

    public RepositoryRestConfigurationBean(RepositoryRestConfiguration restConfiguration) {
        this.restConfiguration = restConfiguration;
        this.restConfiguration.exposeIdsFor(Product.class);
    }
}
