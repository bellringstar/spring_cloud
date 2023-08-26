package com.optimagrowth.license.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
//스프링 클라우드 컨피그 서버에서 모든 example 프로퍼티를 가져와 ServiceConfig 클래스의 프로퍼티 속성으로 주입
@ConfigurationProperties(prefix = "example")
@Getter
@Setter
public class ServiceConfig{

  private String property;
    
}