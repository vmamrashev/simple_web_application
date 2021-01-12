package com.example.simplewebapplication;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx){
        CommandLineRunner commandLineRunner = args -> {

            System.out.println("Let's inspect the beans provided by Spring boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
        return commandLineRunner;
    }
}
