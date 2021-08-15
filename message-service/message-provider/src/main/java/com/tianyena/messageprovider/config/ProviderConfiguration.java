package com.tianyena.messageprovider.config;

import com.tianyena.messageservicebiz.config.BizConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.tianyena.messageprovider.message")
@Import(BizConfiguration.class)
@ImportResource("classpath:applicationContext-dubbo-provider.xml")
public class ProviderConfiguration {
}
