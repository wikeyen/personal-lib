package com.lib.designPattern.decorator.coffeeMaker.condiments;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;
import com.lib.designPattern.decorator.coffeeMaker.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double extra;

        switch (beverage.getSize()) {
            case "tall":
                extra = 0.10;
                break;
            case "grande":
                extra = 0.15;
                break;
            case "venti":
                extra = 0.20;
                break;
            default:
                extra = 0;
                break;
        }

        return 0.15 + beverage.cost() + extra;
    }
}
