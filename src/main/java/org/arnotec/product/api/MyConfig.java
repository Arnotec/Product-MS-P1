package org.arnotec.product.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope // refresh when params value has changed in properties files
@RestController
public class MyConfig {

    @Value("${global.param}")
    private String globalParam;
    @Value("${product.local.param}")
    private String productLocalParam;

    @GetMapping(path = "/myConfig")
    public Map<String, Object> getMyConfigs(){
        Map<String, Object> params = new HashMap<>();
        params.put("GlobalParam", globalParam);
        params.put("ProductLocalParam", productLocalParam);
        // get the current thread handling the request
        params.put("TreadName", Thread.currentThread().getName());
        return params;
    }
}
