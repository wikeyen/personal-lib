package com.lib.designPattern.decorator.coffeeMaker.condiments;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;
import com.lib.designPattern.decorator.coffeeMaker.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
