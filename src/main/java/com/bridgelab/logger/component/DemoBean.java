package com.bridgelab.logger.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    String name;

    public DemoBean() {
        this.name = "default"; // or leave null
    }

    public String getName() {
        return name;
    }
}
