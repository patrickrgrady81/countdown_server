package com.patgrady64.countdown.date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConfig {

    @Bean
    CommandLineRunner commandLineRunner(DateRepository repository) {
        return args -> {
            Date now = new Date();

            repository.save(now);
        };
    }
}
