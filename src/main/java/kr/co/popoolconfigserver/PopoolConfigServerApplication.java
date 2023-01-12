package kr.co.popoolconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PopoolConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopoolConfigServerApplication.class, args);
    }

}
