package com.example.cloud_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
@EnableEurekaClient //서비스를 유레카 서비스 디스커버리 에이전트에 등록하여 원격 서비스 위치를 검색하도록 지정한다.
public class CloudExApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudExApplication.class, args);
	}

	public String helloRemoteServiceCall(String firstName, String lastName) {
		RestTemplate restTemplate = new RestTemplate();
		/*
		RestTemplate를 사용하여 '논리적' 서비스 ID를 받으면 내부에서 유레카는 서비스의 물리적 위치를 검색한다.
		 */
		ResponseEntity<String> restExchange
				= restTemplate.exchange("http://logical-service-id/name/" + "{firstName}/" + "{lastName}"
				, HttpMethod.GET, null, String.class, firstName, lastName);
		return restExchange.getBody();
	}

	@RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return helloRemoteServiceCall(firstName, lastName);
	}

}
