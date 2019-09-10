package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public  class  Members{
    public List<Object> third(String n,double a,double s){
        Member_variable temp= new Member_variable(n,a,s);
        return temp.display();
    }
}
class Member
{
    String name;
    double age;
    double salary;
    Member(String name,double age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    List<Object> get(){
        List<Object> ls=new ArrayList<Object>();
        ls.add(this.name);
        ls.add(this.age);
        ls.add(this.salary);
        return ls;
    }
}
class Member_variable
{   Member res;
    Member_variable(String n,double a,double s){
        res=new Member(n,a,s);
    }
    List<Object> display(){
        return res.get();
    }
}
