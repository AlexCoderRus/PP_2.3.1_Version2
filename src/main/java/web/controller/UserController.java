package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserServices;

@Controller
public class UserController {

//    private final UserServices userServices;
//    @Autowired
//    public UserController(UserServices userServices) {
//        this.userServices = userServices;
//    }
//
//    @GetMapping(value ="/users")
//    public String index(Model model) {
//        model.addAttribute("Users", userServices.getAllUser());
//        return "users";
//    }
}
