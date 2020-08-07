package com.lib.designPattern.decorator.coffeeMaker;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
    protected String description = "Unknown beverage";
    protected String size = "Unknown size";

    public abstract double cost();

}
