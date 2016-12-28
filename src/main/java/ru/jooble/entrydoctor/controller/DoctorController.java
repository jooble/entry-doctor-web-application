package ru.jooble.entrydoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.jooble.entrydoctor.service.DoctorService;

@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public String getDoctors(Model model) {
        model.addAttribute("doctors", doctorService.findAll());
        return "doctors";
    }
}
