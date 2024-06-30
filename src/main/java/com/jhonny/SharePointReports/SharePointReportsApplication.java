package com.jhonny.SharePointReports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
@ComponentScan
//@ComponentScan("com.jhonny.SharePointReports")
public class SharePointReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharePointReportsApplication.class, args);
	}

}
