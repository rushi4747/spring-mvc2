package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jsp")
public class MyConfig {

	@Bean
	public EntityManagerFactory getEntityManagerFactory()
	{
		return Persistence.createEntityManagerFactory("dev");
	}
	@Bean
	public EntityManager getEntityManager()
	{
		return getEntityManagerFactory().createEntityManager();
		
	}
}
