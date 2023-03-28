package com.example.viikko9;

import java.io.Serializable;
import java.util.ArrayList;

public class User extends UserStorage implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String degreeProgram;
    protected static final long serialVersionUID = 3453475L;
    private final ArrayList<String> degrees;

    private final int picture;

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
