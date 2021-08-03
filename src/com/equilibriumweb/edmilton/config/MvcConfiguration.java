package com.equilibriumweb.edmilton.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

import com.equilibriumweb.edmilton.dao.ProcessoDAO;
import com.equilibriumweb.edmilton.dao.ProcessoDAOImpl;
import com.equilibriumweb.edmilton.dao.TipoProcessoDAO;
import com.equilibriumweb.edmilton.dao.TipoProcessoDAOImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.equilibriumweb.edmilton")
@EnableWebMvc

public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        return dataSource;
    }

    @Bean
    public TipoProcessoDAO getTipoProcessoDAO() {
        return new TipoProcessoDAOImpl(getDataSource());
    }

    @Bean
    public ProcessoDAO getProcessoDAO() {
        return new ProcessoDAOImpl(getDataSource());
    }
}
