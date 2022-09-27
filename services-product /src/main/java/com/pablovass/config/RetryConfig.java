package com.pablovass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

@Configuration
public class RetryConfig {
    @Bean
    public RetryTemplate createRetryTemplete(){
        SimpleRetryPolicy simpleRetryPolicy =new SimpleRetryPolicy();
        simpleRetryPolicy.setMaxAttempts(5);

        ExponentialBackOffPolicy exponentialBackOffPolicy =new ExponentialBackOffPolicy();
        exponentialBackOffPolicy.setInitialInterval(10000L);

        RetryTemplate retryTemplate=new RetryTemplate();
        retryTemplate.setRetryPolicy(simpleRetryPolicy);
        retryTemplate.setBackOffPolicy(exponentialBackOffPolicy);
        return  retryTemplate;
    }
}
