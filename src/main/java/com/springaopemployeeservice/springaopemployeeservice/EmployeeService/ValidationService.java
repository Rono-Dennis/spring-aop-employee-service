package com.springaopemployeeservice.springaopemployeeservice.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public void validateAge(int argument) {
        System.out.println(argument + " is valid");
    }
}
