package com.springaopemployeeservice.springaopemployeeservice.JavaTpoint;

public  class Operation{
    /*before advice*/
    /*public void msg(){System.out.println("msg method invoked");}
    public int m(){System.out.println("m method invoked");return 2;}
    public int k(){System.out.println("k method invoked");return 3;}*/

    /*after advice*/
    /*public int m(){System.out.println("m method invoked");return 2;}
    public int k(){System.out.println("k method invoked");return 3;}*/

    /*Around advice*//*The AspectJ around advice is applied before and after calling the actual business logic methods.*/
    /*public void msg(){System.out.println("msg() is invoked");}
    public void display(){System.out.println("display() is invoked");}*/

    /*AfterThrowing*/
    public void validate(int age)throws Exception{
        if(age<18){
            throw new ArithmeticException("Not valid age");
        }
        else{
            System.out.println("Thanks for vote");
        }
    }
}
