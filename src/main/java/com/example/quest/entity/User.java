package com.example.quest.entity;

import lombok.*;

@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private final String name;
    private final String password;
    private final Statistics statistics;
}
