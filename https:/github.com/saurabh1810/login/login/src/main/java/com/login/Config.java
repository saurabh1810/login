package com.login;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mongodb.MongoClient;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com")
public class Config extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public Datastore initializeMorphia() {
		Datastore datastore = null;
		Morphia morphia = new Morphia();

		morphia.mapPackage("beans");

		MongoClient client = new MongoClient("localhost", 27017);
		datastore = morphia.createDatastore(client, "ABC");

		return datastore;
	}

}

