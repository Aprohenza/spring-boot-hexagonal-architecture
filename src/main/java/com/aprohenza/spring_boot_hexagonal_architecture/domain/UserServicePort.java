package com.aprohenza.spring_boot_hexagonal_architecture.domain;

public interface UserServicePort {

    User findUserById(String userId);

    User createUser(String username, String email, String password);
}
