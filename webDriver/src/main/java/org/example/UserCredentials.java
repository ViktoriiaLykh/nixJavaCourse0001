package org.example;


public enum UserCredentials {

    VALID_USER("aaron.sharp@cigna.com", "qa!23456"),
    INVALID_USER("aaron.sharp@cigna.com", "qa!22222");

    UserCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private final String userName;
    private final String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
