package com.stackroute;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public  class  Grades{
    public Double[] fifth(Double no,Double [] grades){
        if(no!=0.0 && grades!=null){
            Comp temp=new Comp(no,grades);
            Double [] temp1=new Double[]{temp.avg(),temp.max(),temp.min()};
            return temp1;
        }
        else{return null;}
    }
}
class Comp{
    Double no;
    Double [] grades;
    Comp(Double no,Double [] grades){
        this.no=no;
        this.grades=grades;
    }
    Double avg(){
        Double sum=0.0;
        for(Double a:this.grades){
            sum+=a;
        }
        return sum/this.no;
    }
    Double min(){
        Double minimum=grades[0];
        for(Double a:this.grades){
            if(a<minimum){minimum=a;}
        }
        return minimum;
    }
    Double max(){
        Double maximum=grades[0];
        for(Double a:this.grades){
            if(a>maximum){maximum=a;}
        }
        return maximum;
    }
}