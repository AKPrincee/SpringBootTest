package com.ashwini.SpringBootTest.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunners implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------- SpringBootTest Application -------");
	}

}
