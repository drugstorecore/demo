package com.demo.config;

import org.python.util.PythonInterpreter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author devalgas kamga on 05/05/2021. 12:19
 */
@Configuration
public class AppConfig {

    @Bean
    public PythonInterpreter pythonInterpreter() {
        return new PythonInterpreter();
    }

}
