package com.tianyena.billserviceprovider.config;

import com.tianyena.billservicebiz.config.BizConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.tianyena.billserviceprovider")
@Import(BizConfiguration.class)
public class ProviderConfiguration {
}
