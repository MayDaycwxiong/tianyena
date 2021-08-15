package com.tianyena.messageservicedeploy;

import com.tianyena.messageprovider.config.ProviderConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ProviderConfiguration.class)
public class MessageServiceDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageServiceDeployApplication.class, args);
    }

}
