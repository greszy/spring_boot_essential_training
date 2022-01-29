package com.gregoryszymanski.roomwebapp.controllers;

import com.gregoryszymanski.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*In Spring Boot we can annotate classic controllers with @Controller annotation.
This is simply a specialization of the @Component class,
which allows us to auto-detect implementation classes through the classpath scanning*/
@Controller
/*@Controller is typically used in combination with a @RequestMapping annotation for request handling methods.
* In this case it means whenever a user goes to http://localhost:8080/rooms, a page with a list of room information will appear.*/
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    //The @GetMapping annotation is a specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
    //The @GetMapping annotated methods in the @Controller annotated classes handle the HTTP GET requests matched with given URI expression.
    @GetMapping
    //To provide the rooms.html view with usable data, we add rooms data to its Model object.
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
