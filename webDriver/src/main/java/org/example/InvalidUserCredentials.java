package org.example;

public enum InvalidUserCredentials {
    INVALID_USER("aaron.sharp@cigna.com", "qa!22222"),
    INVALID_USERS_PASSWORD("alvernus.lamb@cigna.com", "qa!22gnf222");
//    INVALID_USERS_LOGIN("aaron.sh867arp@cigna.com", "qa!23456")
//    INVALID_USER_2("aaron.sharp444@cigna.com", "qa!228887222"),
//    INVALID_USER_3("aaron.sha556rp@cigna.com", "qa!22753222")

    InvalidUserCredentials(String userName, String password) {
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
