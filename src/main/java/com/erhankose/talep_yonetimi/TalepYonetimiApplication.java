package com.erhankose.talep_yonetimi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class TalepYonetimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalepYonetimiApplication.class, args);

		System.out.println("Hello Dünya!");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return  new ModelMapper();
	}

	@Bean
	public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
		Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
		factory.setResources(new Resource[]{new ClassPathResource("projects.json")});
		return factory;
	}
}
