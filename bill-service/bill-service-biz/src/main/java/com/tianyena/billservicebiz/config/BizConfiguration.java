package com.tianyena.billservicebiz.config;

import com.tianyena.billservicemanager.config.ManagerConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.tianyena.billservicebiz")
@Import(ManagerConfiguration.class)
public class BizConfiguration {
}
