package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(3, 5);
        double sub = calculator.sub(1, 3);
        double mul = calculator.mul(3, 2);
        double div = calculator.div(9, 3);

        //Then
        Assert.assertEquals(8, add, 0.01);
        Assert.assertEquals(-2, sub, 0.01);
        Assert.assertEquals(6, mul, 0.01);
        Assert.assertEquals(3, div, 0.01);
    }

}
