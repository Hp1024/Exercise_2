package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Palindrome{
    public static boolean first(String a){
        char [] rev=new char[a.length()];
        for(int i=a.length()-1;i>=0;i--){
            rev[a.length()-1-i]=a.charAt(i);
        }
        if(a.equals(new String(rev))){return true;}
        else{return false;}
    }
}