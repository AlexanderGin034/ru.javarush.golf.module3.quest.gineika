package com.example.quest.entity;

import com.example.quest.repository.UserRepository;
import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private final String name;
    @Setter private String password;
    private final Statistics statistics;
}
