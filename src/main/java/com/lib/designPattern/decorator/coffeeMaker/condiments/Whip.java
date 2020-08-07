package com.lib.designPattern.decorator.coffeeMaker.condiments;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;
import com.lib.designPattern.decorator.coffeeMaker.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
