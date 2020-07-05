package io.codedifferently;

public class Human 
{
    private String firstName;
    private String lastName;
    static int maxEnergy = 100;
    private int energy;

    public Human(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }

    public void eat(Fruit fruit)
    {
        if(this.energy + fruit.getEnergy() <= maxEnergy)
        {
            this.energy = this.energy + fruit.getEnergy();
        }
        else
        {
            this.energy = maxEnergy;
            System.out.println("Energy full!");
        }
    }
    
    public void work(int hours)
    {
        int energySpent = hours * 10;

        if(this.energy - energySpent < 0)
        {
            System.out.print("Can not do the work. Energy to low. Eat something to gain energy");
        }
        else
        {
            this.energy = this.energy - energySpent;
        }
    }

    public int getEnergy()
    {
        return this.energy;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}