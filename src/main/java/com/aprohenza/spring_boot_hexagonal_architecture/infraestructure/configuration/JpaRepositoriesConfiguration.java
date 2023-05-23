package com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.persistence.jpa"
})
public class JpaRepositoriesConfiguration {
}
