package com.tianyena.messageprovider.config;

import com.tianyena.messageservicebiz.config.BizConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.tianyena.messageprovider.provider")
@Import(BizConfiguration.class)
public class ProviderConfiguration {
}
