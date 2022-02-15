package com.simbirsoft.staff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Integer getUser() {
        return 4;
    }
}
