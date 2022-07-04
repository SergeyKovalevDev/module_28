package ru.sf;

import lombok.Data;

// Аннотация @Data включает в себя все аннотации: @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode

@Data
public class AuthorJ {

    private String firstName;

    private String lastName;

    private String biography;

}
