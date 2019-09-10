package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Factorial{
    public ArrayList sixth_first(){
        boolean flag=true;
        ArrayList li=new ArrayList();
        int i=1;
        int fact=1;
        System.out.println(li);
        while(flag){
            if((Integer.MAX_VALUE/fact)<i){
                li.add("Out of bound");
                flag=false;
            }
            else{
                fact=fact*i;
                i++;
                li.add(fact);
            }
        }
        return li;
    }
    public List<String> sixth_second(){
        boolean flag=true;
        long i=1l;
        long fact=1l;
        ArrayList li=new ArrayList();
        while(flag) {
            if((Long.MAX_VALUE/fact)<i){
                li.add("Out of bound");
                flag=false;
            }
            else{
                fact=fact*i;
                i++;
                li.add(fact);
            }

        }
        return li;
    }
}