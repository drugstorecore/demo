package com.demo.service.impl;

import com.demo.service.TestService;
import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author devalgas kamga on 05/05/2021. 12:20
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public Boolean test() {
        try (PythonInterpreter pyInterp = new PythonInterpreter()){
            pyInterp.exec("print('Hello Python World!')");
        }
        return true;
    }
}
