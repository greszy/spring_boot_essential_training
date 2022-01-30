package com.gregoryszymanski.roomwebapp.data;

import com.gregoryszymanski.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
