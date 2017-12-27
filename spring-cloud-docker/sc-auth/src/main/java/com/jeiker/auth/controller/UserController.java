package com.jeiker.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author : xiao
 * @date : 17/12/27 下午2:34
 * @description :
 */
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/current")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
