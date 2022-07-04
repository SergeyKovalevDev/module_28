package ru.sf;

import lombok.Value;

// Аннотация @Value аналогична @Data, за исключением того, что все поля по умолчанию являются закрытыми, и final,
// Setter при этом не создаются. Т.е. объект, аннотированный @Value, сразу становится неизменяемым.

@Value
public class AuthorK {

    String firstName;

    String lastName;

    String biography;

}
