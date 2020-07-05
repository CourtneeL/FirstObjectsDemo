package io.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class FruitTest 
{
    @Test
    public void constructerTest()
    {
        //Given
        String type = "tomato";
        int energy = 20;

        //When
        Fruit testFruit = new Fruit(type, energy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        //Then 
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);



    }
}