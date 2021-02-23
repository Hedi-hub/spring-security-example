package springsecurityexample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springsecurityexample.demo.models.User;
import springsecurityexample.demo.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/registerNew")
    public String registerNewUser(@RequestParam("username") String userName,
                                  @RequestParam("password") String password){
        User user= new User(userName,password);
        userService.saveUser(user);
        return "redirect:/login";
    }

    @RequestMapping("/signup")
    public String registerPage(){
        return "registration";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }


}
