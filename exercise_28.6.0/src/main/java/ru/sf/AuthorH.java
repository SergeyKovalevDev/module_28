package ru.sf;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = {"biography"})
public class AuthorH {

    private String firstName;

    private String lastName;

    private String biography;

}