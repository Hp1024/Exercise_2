package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class  Users{
    public String [] seventh(String firstName,String lastName,float age,double salary){
        User temp=new User();
        temp.set(firstName,lastName,age,salary);
        User temp1=temp.get();
        String [] result={temp1.isValidAge(),temp1.getFullName()};
        return result;

    }
}
class User{
    private String firstName;
    private String lastName;
    private float age;
    private double salary;
    void set(String firstName,String lastName,float age,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        if(age>=0 && age<=100){
            this.age=age;
        }
        this.salary=salary;
    }
    User get(){
        return this;
    }
    String isValidAge(){
        if(this.age<=60 && this.age>=18){return  "true";}
        else {return "false";}
    }
    String getFullName(){
        return this.firstName+this.lastName;
    }
}