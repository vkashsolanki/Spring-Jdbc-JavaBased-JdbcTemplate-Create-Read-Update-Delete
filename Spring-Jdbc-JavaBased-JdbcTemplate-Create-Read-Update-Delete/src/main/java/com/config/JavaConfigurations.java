package com.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com")
@Configuration
public class JavaConfigurations {

	@Bean
	public DataSource getMysqlDataSource() {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springjdbc10");
		source.setUsername("root");
		source.setPassword("root");

		return source;

	}

	@Bean
	public JdbcTemplate getJdbcTemplate() throws SQLException {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getMysqlDataSource()); 
		jdbcTemplate.getDataSource().getConnection();
		return jdbcTemplate;
	}

}
