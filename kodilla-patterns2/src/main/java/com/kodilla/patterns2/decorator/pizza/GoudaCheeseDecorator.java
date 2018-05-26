package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GoudaCheeseDecorator extends AbstractPizzaDecorator {
    public GoudaCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + gouda";
    }
}
