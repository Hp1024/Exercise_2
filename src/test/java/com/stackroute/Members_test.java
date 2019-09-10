package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class Members_test{
    private Members app=new Members();
    @Test
    public void third_test()
    {   List <Object> result=new ArrayList<>();
        result.add("Hari");
        result.add(21.0);
        result.add(0.0);
        assertEquals(result, app.third("Hari",21.0,0.0));
        assertNotEquals(result,app.third("Priya",21.0,0.0));
        assertNotNull(app.third(null,0.0,0.0));
    }
}