package com.example.quest.entity;

public enum Role {
    ADMIN("Администратор"),
    USER("Пользователь"),
    GUEST("Гость");

    private String nameRole;

    private Role(String nameRole) {
        this.nameRole = nameRole;
    }
}
