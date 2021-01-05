package edu.aku.hassannaqvi.naunehal.models;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class Users {


    String username;
    String password;
    String fullName;

    public String getUsername() {
        return username;
    }

    public Users setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Users setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
}