package com.gregoryszymanski.roomwebapp.service;

import com.gregoryszymanski.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    //Here a list of rooms are generated. This list is later displayed in the rooms.html template.
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for(int i=0;i<10;i++) {
            rooms.add(new Room(i, "Room " +i,"R"+i, "Q"));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
