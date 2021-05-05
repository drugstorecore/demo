package com.demo.service.impl;

import com.demo.service.TestService;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

/**
 * @author devalgas kamga on 05/05/2021. 12:20
 */
@Service
public class TestServiceImpl implements TestService {
    private final PythonInterpreter pythonInterpreter;

    public TestServiceImpl(PythonInterpreter pythonInterpreter) {
        this.pythonInterpreter = pythonInterpreter;
    }

    @Override
    public Boolean test() {
        pythonInterpreter.exec("print('Hello Python World!')");
        return true;
    }
}
