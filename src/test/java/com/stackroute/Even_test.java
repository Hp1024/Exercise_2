package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class Even_test{
    private Even app=new Even();
    @Test
    public void fourth_test(){
        boolean result=true;
        assertEquals(result,app.fourth(6));
        assertNotEquals(result,app.fourth(3));
        assertNotNull(app.fourth(0));
    }

}