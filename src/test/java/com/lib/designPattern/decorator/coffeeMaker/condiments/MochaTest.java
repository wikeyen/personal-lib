package com.lib.designPattern.decorator.coffeeMaker.condiments;

import com.lib.designPattern.decorator.coffeeMaker.Beverage;
import com.lib.designPattern.decorator.coffeeMaker.basicTypes.Espresso;
import com.lib.designPattern.decorator.coffeeMaker.basicTypes.HouseBlend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MochaTest {

    @Test
    void should_return_espresso() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());
        assertEquals("Espresso", espresso.getDescription());
        assertEquals(1.99, espresso.cost());
    }

    @Test
    void should_return_houseBlend() {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());

        assertEquals("House Blend, Mocha, Mocha, Soy, Whip", houseBlend.getDescription());
        assertEquals(1.54, houseBlend.cost());
    }

    @Test
    void should_return_venti_size_houseBlend() {
        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize("venti");
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());

        assertEquals("House Blend, Mocha, Mocha, Soy, Whip", houseBlend.getDescription());
        assertEquals(1.74, houseBlend.cost());
    }
}