package com.webapp.springbootwebapp.login;

import com.webapp.springbootwebapp.login.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(){
        return "Login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);


            return "welcome";
        }
        else{
            model.put("error", "Bad credentials");
            return "Login";
        }

    }
}
