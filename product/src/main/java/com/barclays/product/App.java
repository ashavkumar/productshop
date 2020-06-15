package com.barclays.product;


import java.text.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication(scanBasePackages= {"com.barclays.product"})
@EnableEurekaClient
public class App {
	public static void main( String[] args ) throws ParseException {
		SpringApplication.run(App.class, args);
    }
}
