package org.example;


public enum ValidUserCredentials {

    VALID_USER("aaron.sharp@cigna.com", "qa!23456"),
    VALID_USER_1("alvernus.lamb@cigna.com", "qa!23456");


    ValidUserCredentials(String userName, String password) {
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
