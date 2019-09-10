
package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Even{
    public boolean fourth(int num){
        EvenNumTest res=new EvenNumTest();
        return res.isEven(num);
    }
}
class EvenNumTest{
    boolean isEven(int a){
        if(a%2==0){return true;}
        else{return false;}
    }
}