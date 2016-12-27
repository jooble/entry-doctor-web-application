package ru.jooble.entrydoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//TODO переназвать контроллер
@Controller
public class MainController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage() {
        System.out.println(bCryptPasswordEncoder.encode("1234"));

        return "static/index.html";
    }

    @RequestMapping(value = "/app", method = RequestMethod.GET)
    public String test() {
        return "static/app.html";
    }
}
