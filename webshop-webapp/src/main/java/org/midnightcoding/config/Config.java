package org.midnightcoding.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by red3 on 9/6/2016.
 */
@Configuration
@ComponentScan("org.midnightcoding.services")
@Import(DataSourceConfig.class)
public class Config {
    // may now use @Autowired to reference beans from other @Configuration classes, XML, etc
}