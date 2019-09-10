package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class Factorial_test{
    private Factorial app=new Factorial();
    @Test
    public  void  sixth_first_test(){
        ArrayList res=new ArrayList();
        res.add(1);
        res.add(2);
        res.add(6);
        res.add(24);
        res.add(120);
        res.add(720);
        res.add(5040);
        res.add(40320);
        res.add(362880);
        res.add(3628800);
        res.add(39916800);
        res.add(479001600);
        res.add("Out of bound");
        assertEquals(res,app.sixth_first());

    }
    @Test
    public  void  sixth_second_test(){
        ArrayList res=new ArrayList();
        res.add(1L);
        res.add(2L);
        res.add(6L);
        res.add(24L);
        res.add(120L);
        res.add(720L);
        res.add(5040L);
        res.add(40320L);
        res.add(362880L);
        res.add(3628800L);
        res.add(39916800L);
        res.add(479001600L);
        res.add(6227020800L);
        res.add(87178291200L);
        res.add(1307674368000L);
        res.add(20922789888000L);
        res.add(355687428096000L);
        res.add(6402373705728000L);
        res.add(121645100408832000L);
        res.add(2432902008176640000L);
        res.add("Out of bound");
        assertEquals(res,app.sixth_second());
    }

}