package com.lib.designPattern.decorator.coffeeMaker.basicTypes;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super.setDescription("House Blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
