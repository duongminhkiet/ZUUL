package com.zmk.zsull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZsullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZsullApplication.class, args);
	}
	  @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }
}