package ru.sf;

import lombok.EqualsAndHashCode;

// Если в equals() и hashcode() нужно включить не все поля класса,
// то можно класс аннотировать @EqualsAndHashCode с указанием свойства onlyExplicitlyIncluded = true,
// и каждое поле, которое нужно включить в методы, аннотировать @EqualsAndHashCode.Include.

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AuthorI {

    @EqualsAndHashCode.Include
    private String firstName;

    @EqualsAndHashCode.Include
    private String lastName;

    private String biography;

}