package com.y2080ad.yellowdog.services.routes.config;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;


	/**
	 * The accounts Spring configuration.
	 * 
	 * @author Paul Chapman
	 */
	@Configuration
	@ComponentScan
	@EntityScan("com.y2080ad.yellowdog.services.routes.repository")
	@EnableJpaRepositories("com.y2080ad.yellowdog.services.routes.repository")
	@PropertySource("classpath:db-config.properties")
	public class RoutesConfiguration {

		protected Logger logger;

		public RoutesConfiguration() {
			logger = Logger.getLogger(getClass().getName());
		}

		/**
		 * Creates an in-memory "rewards" database populated with test data for fast
		 * testing
		 */
		@Bean
		public DataSource dataSource() {
			logger.info("dataSource() invoked");

			DataSource dataSource = (new EmbeddedDatabaseBuilder()).build();
			logger.info("dataSource = " + dataSource);

			return dataSource;
		}
	}
