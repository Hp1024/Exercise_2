package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Power{
    public boolean second(int num){
        while(num>1){
            num/=4;
        }
        if(num==1){return true;}
        else{return false;}
    }
}