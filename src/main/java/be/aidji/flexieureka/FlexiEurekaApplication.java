package be.aidji.flexieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlexiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexiEurekaApplication.class, args);
    }

}
