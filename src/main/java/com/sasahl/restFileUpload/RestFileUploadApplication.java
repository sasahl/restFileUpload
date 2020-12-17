package com.sasahl.restFileUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class RestFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFileUploadApplication.class, args);
	}

}
