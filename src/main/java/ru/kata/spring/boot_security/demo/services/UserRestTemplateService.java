package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserRestTemplateService {

    void rtGetAllUsers();

    void rtGetUserById();

    void rtSaveUser();

    void rtUpdateUser();

    void rtDeleteUser();
}

