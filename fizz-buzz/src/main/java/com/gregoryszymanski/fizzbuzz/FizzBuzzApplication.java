package com.gregoryszymanski.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

	/*
	Here we are implementing an example of the FizzBuzz exercise using the CommandLineRunner.
	The classic FizzBuzz challenge involves iterating a certain amount of times and displaying a specific value depending on the iteration number.
	Here we are printing out the string "Fizz" if the index is divisible by 3. If the index is divisible by 5 we print out the string "Buzz".
	If the index is divisible by both 3 and 5, we will print out the string "FizzBuzz". If the index is not divisible by 3 and 5, the program will
	print out the numeric value of the index.
	 */
	@Bean
	public CommandLineRunner run() {
		return args -> {
			//Here we set the number of times the loop will loop through to 100.
			for(int i=1; i < 101; i++) {
				//We declare an empty String that will be modified.
				String stringResult = "";
				/*
				Here we are using a combination of a compound assignment operator and a ternary operator to decide if we should add "Fizz" to the empty string.
				If the index module of 3 is equal 0, that means the index is divisible by 3 and "Fizz" should be added to string. If not an empty string will be added.
				 */
				stringResult += (i % 3) == 0 ? "Fizz" : "";
				/*
				Here we are using a combination of a compound assignment operator and a ternary operator to decide if we should add "Buzz" to the empty string.
				If the index module of 5 is equal 0, that means the index is divisible by 5 and "Buzz" should be added to string. If not an empty string will be added.
				 */
				stringResult += (i % 5) == 0 ? "Buzz" : "";
				/*
				This line is important for deciding when the numeric value should be displayed. We are using another ternary operator for that.
				If after the previous 2 ternary divisibility checks the stringResult is still empty, that means that the index is neither divisible by 3 or 5, the numeric value of the index should be displayed instead.
				 */
				System.out.println(!stringResult.isEmpty() ? stringResult : i);
			}
		};
	}
}
