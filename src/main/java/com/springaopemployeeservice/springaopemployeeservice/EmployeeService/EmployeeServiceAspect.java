package com.springaopemployeeservice.springaopemployeeservice.EmployeeService;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect
{
    @Pointcut("within(ValidationService)")
    public void validationPointcut(){}

    @Pointcut("execution(* com.springaopemployeeservice.springaopemployeeservice.model.Employee.getEmpId(..))")
    private void selectGetName(){}

    @Before(value = "execution(* EmployeeService.*(..)) && args(empId, fname, sname)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);
    }

    @After(value = "execution(* EmployeeService.*(..)) && args(empId, fname, sname)")
    public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);
    }

    @Around("validationPointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("In Around Aspect");
        int arg = (int) joinPoint.getArgs()[0];
        if (arg < 0)
            throw new RuntimeException("Argument should not be negative");
        else if (arg < 0)
            joinPoint.proceed();
    }

}
