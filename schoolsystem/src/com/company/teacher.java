package com.company;

public class teacher extends user {
    teacher(int userID,
            String firstName,
            String lastName,
            String email,
            String password
    ) {
        super(userID, firstName, lastName, email,password);
    }
}
