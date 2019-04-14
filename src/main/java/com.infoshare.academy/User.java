package com.infoshare.academy;

public class User {
    private int id;
    private String name;
    private String surname;
    private Credentials credentials;

    public User(int id, String name, String surname, Credentials credentials) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.credentials = credentials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", credentials=" + credentials +
                '}';
    }
}
