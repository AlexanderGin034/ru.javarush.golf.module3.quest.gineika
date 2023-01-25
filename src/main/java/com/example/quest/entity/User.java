package com.example.quest.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private final String name;
    @Setter private String password;
    private Role role;
    private final Statistics statistics;
}
