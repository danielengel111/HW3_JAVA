import java.util.*;


public class Zoo
{
    private static Zoo instance = new Zoo();
    private ArrayList<ZooObserver> observers;
    private int hunger;
    private int happiness;

    private Zoo()
    {
        this.observers = new ArrayList<>();
        this.happiness = 2;
        this.hunger = 3;
    }

    public static Zoo getInstance()
    {
        return instance;
    }

    public void addObserver(ZooObserver observer)
    {
        this.observers.add(observer);
    }

    public void addAnimal(Animal animal)
    {

    }

    public void feedAnimals()
    {
        //do something
        this.hunger--;
        //do something
    }

    public void watchAnimals()
    {
        //do something
        this.happiness++;
        this.hunger++;
        //do something
    }

    public void showAnimalsInfo()
    {
        if(this.happiness < 3)
        {
            System.out.println("The animals are not happy, you should watch them...");
        }
        else if(this.happiness > 3)
        {
            System.out.println("The animals are very happy, keep working hard...");
        }
        if(this.hunger > 3)
        {
            System.out.println("The animals are hungry, you should feed them...");
        }
    }

    public void removeObserver(ZooObserver observer)
    {
        this.observers.remove(observer);
    }
}
