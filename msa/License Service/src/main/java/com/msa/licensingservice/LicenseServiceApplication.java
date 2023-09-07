package com.msa.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope // actuator의 /refresh를 사용해 프로퍼티 동적 적용
public class LicenseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicenseServiceApplication.class, args);
	}

}
