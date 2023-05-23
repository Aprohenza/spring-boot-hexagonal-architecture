package com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.configuration;

import com.aprohenza.spring_boot_hexagonal_architecture.domain.UserRepository;
import com.aprohenza.spring_boot_hexagonal_architecture.domain.UserService;
import com.aprohenza.spring_boot_hexagonal_architecture.domain.UserServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration {

    @Bean
    UserServicePort userSevice(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
