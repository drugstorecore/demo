package com.demo.rest;

import org.python.util.PythonInterpreter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestResource {
    private final PythonInterpreter pythonInterpreter;

    public TestResource(PythonInterpreter pythonInterpreter) {
        this.pythonInterpreter = pythonInterpreter;
    }


    @GetMapping("/test")
    public Boolean test() {
        pythonInterpreter.exec("print('Hello Python World!')");
        return true;

    }
}
