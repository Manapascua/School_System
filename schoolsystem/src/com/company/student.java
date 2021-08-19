package com.company;

public class student extends user {
    student(int userID,
            String firstName,
            String lastName,
            String email,
            String password
    ) {
        super(userID, firstName, lastName, email, password);
    }
}
