package com.tech552.springbootactuatordemo.monitor;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "features")
@Component
public class FeaturesEndpoint {
    /**
     * You can trigger this by /actuator/features?id={:id}
     *
     * @param id
     * @return
     */
    @ReadOperation
    public Map<String, String> customEndpoint(String id) {
        Map<String, String> map = new HashMap();

        map.put("id", id);
        map.put("details", "This is your custom endpoint");
        return map;
    }
}
