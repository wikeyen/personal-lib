package com.lib.designPattern.decorator.coffeeMaker;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public abstract String getSize();
}
