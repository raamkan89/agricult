/**
 *  Copyright reserved
 */
package com.agricult.app.springApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.agricult.app.*")
@ComponentScan("com.agricult.app.*")
public class AgriCultApplication {

	/**
	 * @param args Arguments
	 * 
	 * Starting of execution of the application  
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(AgriCultApplication.class).run(args);
	}
}