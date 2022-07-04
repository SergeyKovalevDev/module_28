package ru.sf;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthorE {

    @NonNull
    private String firstName;

    private final String lastName;

    private String biography;

}