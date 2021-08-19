package com.company;

public class user {
    private int userID;
    private String firstName, lastName;
    private String email;
    private String password;

    user(int userID,
         String firstName,
         String lastName,
         String email,
         String password
         )
    {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    void setUserID(int userID) {
        this.userID = userID;
    }
    int getUserID(){
        return userID;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    String getFirstName() {
        return firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    String getLastName() {
        return lastName;
    }
    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return email;
    }
    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }
}
