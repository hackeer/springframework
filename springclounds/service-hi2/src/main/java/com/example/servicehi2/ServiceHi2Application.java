package com.example.servicehi2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHi2Application {

    public static void main(String[] args) {
        SpringApplication.run( ServiceHi2Application.class, args );
    }

    @Value( "${server.port}" )
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "service-hi") String name){
        return "hi "+ name+", port "+port;
    }

}
