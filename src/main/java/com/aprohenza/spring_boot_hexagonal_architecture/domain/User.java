package com.aprohenza.spring_boot_hexagonal_architecture.domain;

import javax.persistence.Column;

public class User {

    private String id;

    private String username;

    private String email;

    private String password;

    private boolean accountNonLocked = true;

    private boolean accountNonExpired = true;

    private boolean credentialNonExpired = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isCredentialNonExpired() {
        return credentialNonExpired;
    }

    public void setCredentialNonExpired(boolean credentialNonExpired) {
        this.credentialNonExpired = credentialNonExpired;
    }
}
