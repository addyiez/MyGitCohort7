package com.acc.lkm.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer();
    }

    @Bean
    public Bank bank() {
        return new Bank();
    }

    @Bean
    public UIAdmin uiAdmin() {
        return new UIAdmin(bank(), customer());
    }
}
