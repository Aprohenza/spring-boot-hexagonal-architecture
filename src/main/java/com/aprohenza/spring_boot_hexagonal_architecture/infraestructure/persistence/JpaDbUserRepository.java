package com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.persistence;

import com.aprohenza.spring_boot_hexagonal_architecture.domain.User;
import com.aprohenza.spring_boot_hexagonal_architecture.domain.UserRepository;
import com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.persistence.jpa.JpaUserRepository;
import com.aprohenza.spring_boot_hexagonal_architecture.infraestructure.persistence.jpa.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class JpaDbUserRepository implements UserRepository {

    private JpaUserRepository jpaUserRepository;


    @Autowired
    public JpaDbUserRepository(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        ModelMapper mapper = new ModelMapper();
        jpaUserRepository.save(mapper.map(user, UserEntity.class));
        return user;
    }

    @Override
    public List<User> saveAll(List<User> users) {
        ModelMapper mapper = new ModelMapper();
        List<UserEntity> entities = users.stream()
                .map(user -> mapper.map(user, UserEntity.class))
                .collect(Collectors.toList());
        jpaUserRepository.saveAll(entities);

        return users;
    }

    @Override
    public Optional<User> findById(String id) {
        ModelMapper mapper = new ModelMapper();
        Optional<UserEntity> optional = jpaUserRepository.findById(id);
        if(optional.isPresent()){
            return Optional.of(mapper.map(optional.get(), User.class));
        }
        return Optional.empty();
    }

    @Override
    public Iterable<User> findAllById(Iterable<String> ids) {
        ModelMapper mapper = new ModelMapper();
        return jpaUserRepository.findAllById(ids).stream()
                .map(entity -> mapper.map(entity, User.class))
                .collect(Collectors.toList());
    }
}
