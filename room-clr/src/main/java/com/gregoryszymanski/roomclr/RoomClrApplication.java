package com.gregoryszymanski.roomclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/*
RoomClrApplication is an example of how to create a simple console-based application using Spring Boot.

This class implements Spring's CommandLineRunner interface.
CommandLineRunner is a simple Spring Boot interface with a run method.
Spring Boot will automatically call the run method of all beans implementing this interface after the application context has been loaded.

Notice that the run method is called after application context is loaded but before the execution of the main method is complete.

Most console applications will only have a single class that implements CommandLineRunner.
If your application has multiple classes that implement CommandLineRunner,
the order of execution can be specified using Spring's @Order annotation.
*/

@SpringBootApplication
public class RoomClrApplication {
	//The logger will allow us to create event statuses across the application. This is a standard procedure with SLF4J as out logger creator.
	private static final Logger LOG = LoggerFactory.getLogger(RoomClrApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder  builder) {
		return builder.build();
	}


	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			/*
			Example of a log message. Here we are logging the fact that the Command Line Runner has started.
			Other events like this can be logged through out the application.
			 */
			LOG.info("Starting CLR application");
			/*
			Here the program will call restTemplate. The restTemplate will exchange and get an element back.
			That returned element is an array of rooms in a form of a List.
			 */
			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
					});
			//Once the List of rooms is received, we can loop through it to display each room object.
			rooms.getBody().forEach(room->{
				LOG.info(room.toString());
					});
			LOG.info("Finishing CLR application");
		};
	}

}
