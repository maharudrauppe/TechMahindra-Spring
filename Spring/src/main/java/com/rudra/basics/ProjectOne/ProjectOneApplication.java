package com.rudra.basics.ProjectOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectOneApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ProjectOneApplication.class); 
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProjectOneApplication.class, args);
		ProductDao result = applicationContext.getBean(ProductDao.class);
		ProductDao result2 = applicationContext.getBean(ProductDao.class);
		
		LOGGER.info("{}", result);
		LOGGER.info("{}", result2); 
		
		LOGGER.info("{}", result.getJdbcConnection());
		LOGGER.info("{}", result2.getJdbcConnection() ); 

		
		
	}

}
 