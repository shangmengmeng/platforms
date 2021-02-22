package com.star.platforms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication
@ComponentScan(basePackages = {"com.star"})
public class PlatformsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformsApplication.class, args);
    }
}*/

@SpringBootApplication
@ComponentScan(basePackages = {"com.star"})
public class PlatformsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PlatformsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PlatformsApplication.class);
    }
}