package com.gregoryszymanski.roomwebapp.data;

import com.gregoryszymanski.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
