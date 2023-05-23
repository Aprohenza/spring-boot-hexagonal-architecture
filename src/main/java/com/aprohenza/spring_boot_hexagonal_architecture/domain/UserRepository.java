package com.aprohenza.spring_boot_hexagonal_architecture.domain;

import java.util.List;
import java.util.Optional;


public interface UserRepository  {

    User save(User entity);
    List<User> saveAll(List<User> entities);
    Optional<User> findById(String id);
    Iterable<User> findAllById(Iterable<String> ids);

}
