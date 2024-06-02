package com.optimagrowth.springkafkaconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class TenantResolver {

    @Value("${multitenant.tenant.id}")
    private String tenant;

    public TenantResolver() {
    }


    public TenantResolver(String tenant) {
        this.tenant = tenant;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
}
