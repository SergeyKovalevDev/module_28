package ru.sf;

import lombok.AccessLevel;
import lombok.Setter;

public class AuthorB {

    @Setter(AccessLevel.PROTECTED)
    private String firstName;

    private String lastName;

    private String biography;
}
