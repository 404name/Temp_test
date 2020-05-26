package com;

public class User {
    private String Username;
    private String UserId;

    public User(String username, String userId) {
        Username = username;
        UserId = userId;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserId() {

        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
