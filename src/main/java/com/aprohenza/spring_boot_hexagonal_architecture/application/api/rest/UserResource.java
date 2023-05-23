package com.aprohenza.spring_boot_hexagonal_architecture.application.api.rest;

import com.aprohenza.spring_boot_hexagonal_architecture.domain.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRestResource.PATH_ROOT + "/user")
public class UserResource {

    private UserServicePort userService;

    @Autowired
    public UserResource(UserServicePort userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable String userId){
        return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest){
        return new ResponseEntity<>(userService.createUser(createUserRequest.getUsername(), createUserRequest.getEmail(), createUserRequest.getPassword())
                , HttpStatus.OK);
    }
}
