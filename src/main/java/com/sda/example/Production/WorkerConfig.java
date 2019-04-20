package com.sda.example.Production;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkerConfig {

    @Bean
    public WorkerMotto workerMotto(){
        return new WorkerMotto("A new way of working!");
    }
}
