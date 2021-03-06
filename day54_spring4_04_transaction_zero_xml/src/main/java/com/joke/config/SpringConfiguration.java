package com.joke.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.joke")
@EnableTransactionManagement
@Import(JdbcConfig.class)
public class SpringConfiguration {
}
