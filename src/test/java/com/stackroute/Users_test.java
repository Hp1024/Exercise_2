package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public  class  Users_test{
    private Users app=new Users();
    @Test
    public void seventh_test(){
        assertEquals(new String[]{"true","Haripriya"},app.seventh("Hari","priya",(float)21.0,0.0));
        assertEquals(new String[]{"false","SonuGulipalli"},app.seventh("Sonu","Gulipalli",(float)17.0,0.0));
        assertNotEquals(new String[]{"true","Haripriya"},app.seventh("Hari","priya",(float)10.0,0.0));

    }
}