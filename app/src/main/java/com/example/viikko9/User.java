package com.example.viikko9;

import java.util.ArrayList;

public class User extends UserStorage {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private ArrayList<String> degrees;

    private int picture;

    public User (String firstName, String lastName, String email, String degreeProgram, int picture, ArrayList<String> degrees){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.picture = picture;
        this.degrees = degrees;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPicture() {
        return picture;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }
}
