package com.gregoryszymanski.roomwebapp.service;

import com.gregoryszymanski.roomwebapp.models.Position;
import com.gregoryszymanski.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Gregory", "Szymanski", Position.CONCIERGE.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Tom", "Fox", Position.SECURITY.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Jane", "Fox", Position.FRONT_DESK.toString()));
        staff.add(new StaffMember(UUID.randomUUID().toString(),"Peter", "Slick", Position.HOUSEKEEPING.toString()));
    }

    public List<StaffMember> getAllStaff() {
        return staff;
    }
}
