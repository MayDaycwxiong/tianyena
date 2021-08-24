package com.tianyena.billservicedeploy;

import com.tianyena.billserviceprovider.config.ProviderConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ProviderConfiguration.class)
public class BillServiceDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillServiceDeployApplication.class, args);
    }

}
