package ru.sf;

import lombok.ToString;

@ToString(exclude = {"biography"})
public class AuthorG {

    private String firstName;

    private String lastName;

    private String biography;

}