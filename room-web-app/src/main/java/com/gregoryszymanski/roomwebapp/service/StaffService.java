package com.gregoryszymanski.roomwebapp.service;

import com.gregoryszymanski.roomwebapp.data.StaffRepository;
import com.gregoryszymanski.roomwebapp.models.Position;
import com.gregoryszymanski.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }
}
