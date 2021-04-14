package com.ashwini.SpringBootTest.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunners implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(MessageRunners.class);

	@Override
	public void run(String... args) throws Exception {
		int a = 100;
		try {
			log.info("Started");
			System.out.println("-------- SpringBootTestApplication -------" + a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("END");
	}

}
