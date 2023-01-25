package com.example.quest.service;

import com.example.quest.entity.User;
import com.example.quest.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Spy
    UserService users = UserService.getUserRepository();
    @Mock
    User patric;

    @Test
    void getUserRepository() {

    }

    @Test
    void creat() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"Admin", "User", "Guest"})
    void whenUserNotNull(String name) {
        assertNotNull(users.find(name).get());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Bob", "Patric"})
    void whenAssertingException(String name) {
        Throwable exception = assertThrows(
                NoSuchElementException.class,
                () -> {
                    users.find(name).get();
                }

        );
        assertEquals("No value present", exception.getMessage());
    }

    @Test
    void delete() {
    }

    @Test
    void updatePassword() {
    }

    @ParameterizedTest
    @ValueSource()
    void whenNameOrPassIsNull(User userName, String pass) {
        users.checkUser(userName, pass);
    }
}