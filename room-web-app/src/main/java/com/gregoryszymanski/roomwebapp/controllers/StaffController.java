package com.gregoryszymanski.roomwebapp.controllers;

import com.gregoryszymanski.roomwebapp.models.Position;
import com.gregoryszymanski.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Gregory", "Szymanski", Position.CONCIERGE.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Tom", "Fox", Position.SECURITY.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Jane", "Fox", Position.FRONT_DESK.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Peter", "Slick", Position.HOUSEKEEPING.toString()));
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staff);
        return "staff";
    }
}
