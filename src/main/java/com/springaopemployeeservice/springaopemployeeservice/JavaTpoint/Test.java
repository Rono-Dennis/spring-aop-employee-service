package com.springaopemployeeservice.springaopemployeeservice.JavaTpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        /*Before advice*/
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");
        e.msg();
        System.out.println("calling m...");
        e.m();
        System.out.println("calling k...");
        e.k();*/

        /*After advice*/
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling m...");
        System.out.println(e.m());
        System.out.println("calling k...");
        System.out.println(e.k());*/

        /*Around advice*/
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Operation op = (Operation) context.getBean("opBean");
        op.msg();
        op.display();*/

        /*After Throwing*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation op = (Operation) context.getBean("opBean");
        System.out.println("calling validate...");
        try{
            op.validate(19);
        }catch(Exception e){System.out.println(e);}
        System.out.println("calling validate again...");

        try{
            op.validate(11);
        }catch(Exception e){System.out.println(e);}

    }

}
