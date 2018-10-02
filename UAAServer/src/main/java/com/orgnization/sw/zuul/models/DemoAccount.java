package com.orgnization.sw.zuul.models;

import java.util.ArrayList;

public class DemoAccount {
    private float id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email = null;
    ArrayList< String > roles = new ArrayList < String > ();
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public boolean getEnabled() {
        return enabled;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoAccount{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", roles=").append(roles);
        sb.append(", accountNonExpired=").append(accountNonExpired);
        sb.append(", accountNonLocked=").append(accountNonLocked);
        sb.append(", credentialsNonExpired=").append(credentialsNonExpired);
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
