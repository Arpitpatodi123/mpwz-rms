package com.mpwz.rmsnew.configuration.datasource.sybase;

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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "sybaseEntityManagerFactory", transactionManagerRef = "sybaseTransactionManager",basePackages = {"com.mpwz.rmsnew.repository.sybase"})
@ComponentScan(basePackages = {"com.mpwz.rmsnew"})
@EnableConfigurationProperties(SybaseDBconfig.class)
public class SybaseDatasourceConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(SybaseDatasourceConfiguration.class);

    @Bean(name = "sybaseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.sybase")
    public DataSource dataSource() {
        String methodName = "dataSource() : ";
        logger.info(methodName + "called");

        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sybaseEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean sybaseEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("sybaseDataSource") DataSource dataSource) {
        String methodName = "sybaseEntityManagerFactory() : ";
        logger.info(methodName + "called");

        return builder.dataSource(dataSource).packages("com.mpwz.rmsnew.beans.sybase").persistenceUnit("sybase").build();
    }

    @Bean(name = "sybaseTransactionManager")
    public PlatformTransactionManager sybaseTransactionManager(@Qualifier("sybaseEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        String methodName = "sybaseTransactionManager() : ";
        logger.info(methodName + "called");
        return new JpaTransactionManager(entityManagerFactory);
    }
}
