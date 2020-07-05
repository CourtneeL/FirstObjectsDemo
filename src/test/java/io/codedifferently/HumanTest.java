package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest 
{
    @Test
    public void constructorTest()
    {
        //Given 
        String first = "Sara";
        String last = "Lance";
        int energy = 50;
        
        //When
        Human testHuman = new Human(first, last);
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test
    public void eatTest()
    {
        //Given
        Fruit pineapple = new Fruit("Pineapple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Mick", "Rory");

        //When
        testHuman.eat(pineapple);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest()
    {
        //Given
        Human testHuman = new Human("Sara", "Lance");
        int expectedEnergy = 30;

        //When
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest()
    {
        //Given
        Human testHuman = new Human("Zari", "Tomaz");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        //When
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void workMin()
    {
        //Given
        Human testHuman = new Human("Zari", "Tomaz");

        //When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(50, actualEnergy);
    }

    @Test
    public void MaxEnergyChangeTest()
    {
        Human h1 = new Human("Nate", "Heywood");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        Human.maxEnergy = 150;

        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);

        int actualEnergy = h1.getEnergy();
       
        Assert.assertEquals(100, actualEnergy);
    }
} 