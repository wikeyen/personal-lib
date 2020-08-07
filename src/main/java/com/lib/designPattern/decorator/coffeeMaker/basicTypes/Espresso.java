package com.lib.designPattern.decorator.coffeeMaker.basicTypes;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
