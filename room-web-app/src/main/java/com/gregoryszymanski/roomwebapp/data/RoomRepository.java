package com.gregoryszymanski.roomwebapp.data;

import com.gregoryszymanski.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository is templatized and it takes two values, first is the element the repository is serving, the second is the data type of the id.
In general Spring repositories are interfaces that let you perform various operations involving JPA entities defined in the application.
*/

public interface RoomRepository extends JpaRepository<Room, Long> {
}
