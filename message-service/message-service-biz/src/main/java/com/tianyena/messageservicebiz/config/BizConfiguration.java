package com.tianyena.messageservicebiz.config;

import com.tianyena.messageservicemanager.config.ManagerConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.tianyena.messageservicebiz")
@Import(ManagerConfiguration.class)
public class BizConfiguration {
}
