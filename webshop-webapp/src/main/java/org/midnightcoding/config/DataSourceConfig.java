package org.midnightcoding.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("create-schema.sql")
                .addScripts("initial-data.sql")
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Autowired DataSource dataSource){
        LocalContainerEntityManagerFactoryBean result = new LocalContainerEntityManagerFactoryBean();
        result.setDataSource(dataSource);
        result.setPersistenceUnitName("h2-unit");
        result.setPackagesToScan("org.midnightcoding.entities");
        Properties jpaProps = new Properties();
        jpaProps.setProperty("javax.persistence.jdbc.driver", "org.h2.Driver");
        jpaProps.setProperty("javax.persistence.jdbc.url", "jdbc:h2:mem:mydb");
        jpaProps.setProperty("javax.persistence.jdbc.user", "sa");
        jpaProps.setProperty("javax.persistence.jdbc.password", "");
        result.setJpaProperties(jpaProps);
        return result;
    }
}