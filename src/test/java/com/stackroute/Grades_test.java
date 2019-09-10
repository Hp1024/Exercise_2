package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public  class  Grades_test{
    private Grades app=new Grades();
    @Test
    public void fifth_test(){
        Double [] result=new Double[]{3.0,4.0,2.0};
        Double [] result1=new Double[]{12.0,4.0,2.0};
        Double [] input=new Double[]{2.0,2.0,4.0,4.0};
        assertEquals(result,app.fifth(4.0,input));
        assertNull(app.fifth(0.0,null));
        assertNotEquals(result1,app.fifth(4.0,input));
    }

}