package ru.kata.spring.boot_security.demo.init;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.services.UserService;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class CreateUserDefault {

    private final UserService userService;

    @PostConstruct
    public void generateUsers() {
        userService.saveUser(new User("Tony", "aaadd321b"));
        userService.saveUser(new User("Liz", "ergRE3e"));
        userService.saveUser(new User("Jon", "WEF3fd"));
        userService.saveUser(new User("Sonya", "FF#Fdfs"));
        userService.saveUser(new User("Bob", "dsaf#sg3"));
        userService.saveUser(new User("Josh", "hsedfgvSd"));
    }
}
