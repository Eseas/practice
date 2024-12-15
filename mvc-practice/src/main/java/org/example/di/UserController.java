package org.example.di;

import org.example.di.annotation.Controller;
import org.example.di.annotation.Inject;

@Controller
public class UserController {

    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}