package com.pocketi.startup;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author abhishekkeshri 06/03/2019
 */

@Configuration
@ComponentScan(basePackages = {"com.pocketi"})
@SpringBootApplication
public class PIStartup extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PIStartup.class);
    }
}
