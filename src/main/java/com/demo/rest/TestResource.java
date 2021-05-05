package com.demo.rest;

import org.python.util.PythonInterpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api")
public class TestResource {


    @GetMapping("/test")
    public Boolean test() {
        String test;
        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            File initialFile = new File("src/main/resources/test.py");
            //via file .py
            pyInterp.execfile(new FileInputStream(initialFile));

            //via code
            pyInterp.exec("print('Hello Python World!')");
            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
