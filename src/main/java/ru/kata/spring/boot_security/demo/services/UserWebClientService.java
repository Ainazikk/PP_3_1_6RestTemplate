package ru.kata.spring.boot_security.demo.services;

public interface UserWebClientService {

    void wcGetAllUsers();

    void wcGetUserById();

    void wcSaveUser();

    void wcUpdateUser();

    void wcDeleteUser();
}

