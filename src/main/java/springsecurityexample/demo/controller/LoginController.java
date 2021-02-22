package springsecurityexample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springsecurityexample.demo.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;


}
