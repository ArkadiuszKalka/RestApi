package com.infoshare.academy;


public class Credentials {
    private User user;
    private String password;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "user=" + user +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(User user, String password) {
        this.user = user;
        this.password = password;



    }
}
