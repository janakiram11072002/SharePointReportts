package com.jhonny.SharePointReports;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jhonny.SharePointReports.PersistenceModels.Site;
import com.jhonny.SharePointReports.PersistenceModels.SiteKey;
import com.jhonny.SharePointReports.Services.DbService;

@SpringBootApplication
//@Configuration
//@ComponentScan
// @EnableJpaRepositories(basePackages = { "com.jhonny.SharePointReports.Services" })
// @EntityScan
// @ComponentScan("com.jhonny.SharePointReports")
public class SharePointReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharePointReportsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DbService siteDao)
	{
		return runner -> { storeSite(siteDao); };
	}

	public void storeSite(DbService siteDao)
	{
		System.out.println("Hello");
		Site site = new Site();
		site.key = new SiteKey();
		site.key.id = "19";
		
		//siteDao.saveSite(site);
	}
}
