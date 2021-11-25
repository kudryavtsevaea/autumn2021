package com.netcracker.lesson;

import static org.junit.Assert.assertTrue;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;


public class AppTest 
{
    private Calculator calculator = new Calculator();

    @Test
    public void testDevide(){
        float result = calculator.devide(10.0f, 5.0f);
        Assert.assertEquals(2.0, result, 1);
        System.out.println("successful devide");
    }

    @Test
    public void testDevideByZero(){
        float result = calculator.devide(10.0f, 0);
        if (calculator.b == 0)
            result = -1;
            Assert.assertEquals(-1, result, 1);
        System.out.println("devide by zero");
    }

    @Test
    public void testMultiple(){
        float result = calculator.multiple(-2.0f, 0);
        Assert.assertEquals( 0, result, 1);
        System.out.println("successful multiple");
    }

    @Test
    public void testSub(){
        float result = calculator.minus(0f, -1.6f);
        Assert.assertEquals(1.6f, result, 1);
        System.out.println("successful sub");
    }

    @Test
    public void testAdd(){
        float result = calculator.add(200.89f, -1.6f);
        Assert.assertEquals(198.83f, result, 1);
        System.out.println("successful sub");
    }
}
