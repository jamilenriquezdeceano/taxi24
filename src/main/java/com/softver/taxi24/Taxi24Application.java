package com.softver.taxi24;

import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.repository.ConductorRepository;
import com.softver.taxi24.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Taxi24Application implements CommandLineRunner {
	@Autowired
	private ConductorRepository conductorRepository;
	public static void main(String[] args) {
		SpringApplication.run(Taxi24Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception {

		conductorRepository.findAll().forEach((c) -> System.out.println(c.getNombre()));

	}

}
