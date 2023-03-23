package com.example.viikko9;

public class User extends UserStorage {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int picture;

    public User (String firstName, String lastName, String email, String degreeProgram, int picture){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.picture = picture;
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

}
