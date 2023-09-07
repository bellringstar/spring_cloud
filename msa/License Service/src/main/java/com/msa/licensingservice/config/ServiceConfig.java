package com.msa.licensingservice.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "example") //config 서버에서 값을 가져온다.
@Getter
@Setter
@Slf4j
public class ServiceConfig {

    private String property;
}
