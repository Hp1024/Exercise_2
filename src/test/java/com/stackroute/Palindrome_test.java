package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class Palindrome_test{
    private static Palindrome app=new Palindrome();
    @Test
    public void first_test(){
        boolean result=true;
        assertEquals(result,Palindrome.first("abcba"));
        assertNotEquals(result,Palindrome.first("abcd"));
        assertEquals(result,Palindrome.first("1221"));
    }
}