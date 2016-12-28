package ru.jooble.entrydoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.jooble.entrydoctor.entity.Schedule;
import ru.jooble.entrydoctor.entity.User;
import ru.jooble.entrydoctor.service.ScheduleService;
import ru.jooble.entrydoctor.service.UserService;

import java.security.Principal;

@Controller
public class ScheduleController {
    @Autowired
    private UserService userService;

    @Autowired
    private ScheduleService scheduleService;


    @RequestMapping(value = "/schedule/{id}/entry", method = RequestMethod.GET)
    public String entryToDoctor(Principal principal, @PathVariable("id") Long id) {
        User user = userService.findUser(principal.getName());
        Schedule schedule = scheduleService.findSchedule(id);
        schedule.setUser(user);

        scheduleService.save(schedule);

        return "redirect:/doctors";
    }

    @RequestMapping(value = "/doctor/{id}/schedules", method = RequestMethod.GET)
    public String getDoctorSchedule(Model model, @PathVariable("id") Long id) {
        model.addAttribute("schedules", scheduleService.getFreeScheduleByDoctor(id));
        return "schedules";
    }
}
