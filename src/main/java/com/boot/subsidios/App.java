package com.boot.subsidios;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.subsidios.model.Proyecto;
import com.boot.subsidios.repository.ProyectoRepository;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
/**
 * Java Main Class
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    
    /*
    @Bean
    ApplicationRunner init(ProyectoRepository repository) {
    			Proyecto a = new Proyecto(1L, "Proyecto 1", 2005, 2007); //LocalDate.of(2017, 10, 29)
    			repository.save(a);
    			Proyecto b = new Proyecto(2L, "Proyecto 2", 2002, 2009);
    			repository.save(b);
    			Proyecto c = new Proyecto(3L, "Proyecto 3", 2015, 2016);
    			repository.save(c);
    			//srepository.list().forEach(System.out::println);
				return null;
    }
    */
}
