package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class Power_test{
    private Power app= new Power();
    @Test
    public void second_test()
    {   boolean res=true;
        assertEquals(res,app.second(16));
        assertNotEquals(res,app.second(14));
        assertNotNull(app.second(1));
    }
}