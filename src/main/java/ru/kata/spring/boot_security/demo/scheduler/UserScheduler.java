package ru.kata.spring.boot_security.demo.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.services.UserRestTemplateService;
import ru.kata.spring.boot_security.demo.services.UserWebClientService;

@Component
@RequiredArgsConstructor
public class UserScheduler {

    private final UserRestTemplateService userRestTemplateService;
    private final UserWebClientService userWebClientService;

    @Scheduled(initialDelay = 2000, fixedRate = 1)
    public void restTemplateScheduling() {
        userRestTemplateService.rtSaveUser();
        userRestTemplateService.rtGetUserById();
        userRestTemplateService.rtUpdateUser();
        userRestTemplateService.rtDeleteUser();
    }

    @Scheduled(initialDelay = 2000, fixedRate = 1)
    public void webClientScheduling() {
        userWebClientService.wcSaveUser();
        userWebClientService.wcGetUserById();
        userWebClientService.wcUpdateUser();
        userWebClientService.wcDeleteUser();
    }
}

