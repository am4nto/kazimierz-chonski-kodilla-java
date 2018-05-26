package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        Pizza pizza = new BasicPizza();
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testMargharita() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new BasilDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(16), calculatedCost);
    }

    @Test
    public void testTripleCheese() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new BasilDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testQuatroFromaggi() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new BasilDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ChedarCheeseDecorator(pizza);
        pizza = new ParmezanCheeseDecorator(pizza);
        pizza = new GoudaCheeseDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(24.5), calculatedCost);
    }

    @Test
    public void testChoco() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CranberryDecorator(pizza);
        pizza = new ChocolateDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testAllIngredients() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new BasilDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ChedarCheeseDecorator(pizza);
        pizza = new ParmezanCheeseDecorator(pizza);
        pizza = new GoudaCheeseDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new SalmonDecorator(pizza);
        pizza = new CranberryDecorator(pizza);
        pizza = new ChocolateDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        System.out.println(pizza.getDescription() + ",");
        System.out.println( "Cena: " + pizza.getCost() + " PLN");
        assertEquals(new BigDecimal(36.5), calculatedCost);
    }
}