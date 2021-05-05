package com.demo;

import org.python.util.PythonInterpreter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try (PythonInterpreter pyInterp = new PythonInterpreter()) {
			File initialFile = new File("src/main/resources/test.py");
			//via file .py
			pyInterp.execfile(new FileInputStream(initialFile));
			//via code
			pyInterp.exec("print('Hello Python World!')");

		}

	}
}
