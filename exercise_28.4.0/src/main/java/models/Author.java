package models;

import annotation.BuilderProperty;

public class Author {

    private String firstName;

    private String lastName;

    private String biography;

    @BuilderProperty
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @BuilderProperty
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @BuilderProperty
    public void setBiography(String biography) {
        this.biography = biography;
    }
}