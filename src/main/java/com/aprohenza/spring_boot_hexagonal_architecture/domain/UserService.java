package com.aprohenza.spring_boot_hexagonal_architecture.domain;


import io.azam.ulidj.ULID;

public class UserService implements UserServicePort{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String username, String email, String password) {
        String ulid = ULID.random();
        User user = new User();
        user.setId(ulid);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public User findUserById(String userId) {
        return userRepository.findById(userId).orElseThrow();
    }
}
