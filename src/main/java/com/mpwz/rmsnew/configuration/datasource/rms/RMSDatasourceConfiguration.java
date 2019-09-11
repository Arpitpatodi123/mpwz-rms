package com.mpwz.rmsnew.configuration.datasource.rms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "rmsEntityManagerFactory", transactionManagerRef = "rmsTransactionManager",basePackages = {"com.mpwz.rmsnew.repository.rms"})
@ComponentScan(basePackages = {"com.mpwz.rmsnew"})
@EnableConfigurationProperties(RMSDBconfig.class)
public class RMSDatasourceConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(RMSDatasourceConfiguration.class);

    @Primary
    @Bean(name = "rmsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.rms")
    public DataSource dataSource() {
        String methodName = "dataSource() : ";
        logger.info(methodName + "called");

        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "rmsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean rmsEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("rmsDataSource") DataSource dataSource) {
        String methodName = "rmsEntityManagerFactory() : ";
        logger.info(methodName + "called");

        return builder.dataSource(dataSource).packages("com.mpwz.rmsnew.beans.rms").persistenceUnit("rms").build();
    }

    @Primary
    @Bean(name = "rmsTransactionManager")
    public PlatformTransactionManager rmsTransactionManager(@Qualifier("rmsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        String methodName = "rmsTransactionManager() : ";
        logger.info(methodName + "called");
        return new JpaTransactionManager(entityManagerFactory);
    }
}
