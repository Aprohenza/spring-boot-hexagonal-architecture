package com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;


public interface JpaUserRepository extends JpaRepository<UserEntity, String> {

}
