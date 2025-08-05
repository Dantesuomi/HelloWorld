package com.test.demo;

import com.test.demo.Service.GreetService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	private final GreetService greetService = new GreetService();

	@Test
	void contextLoads() {
	}
	@Test
	public void testGreetPersonWithName() {
		String result = greetService.greetPerson(Optional.of("Alice"));
		assertEquals("Hello, Alice", result);
	}

	@Test
	public void testGreetPersonWithoutName() {
		String result = greetService.greetPerson(Optional.empty());
		assertEquals("Hello World", result);
	}

	@Test
	public void testGreetPersonWithBlankName() {
		String result = greetService.greetPerson(Optional.of(""));
		assertEquals("Hello, ", result);
	}






}
