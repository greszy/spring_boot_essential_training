package com.gregoryszymanski.roomwebapp.data;

import com.gregoryszymanski.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

/*
This interface is one of the repositories implemented for this demo project.
To read more about this type of interface, please check the RoomRepository for additional comments.
 */
public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
